package com.kh.springtest01.websocket;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.springtest01.dao.MemberDao;
import com.kh.springtest01.dao.MessageDao;
import com.kh.springtest01.dto.MessageDto;
import com.kh.springtest01.service.JwtService;
import com.kh.springtest01.vo.ChatRequestVO;
import com.kh.springtest01.vo.room.RoomVO;
import com.kh.springtest01.vo.room.UserVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberChatWebSocketServer extends TextWebSocketHandler {

    @Autowired
    private MessageDao messageDao;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private MemberDao memberDao;

    private Set<WebSocketSession> users = new CopyOnWriteArraySet<>();

    private Map<String, RoomVO> channel = Collections.synchronizedMap(new HashMap<>());

    // 새로운 방 생성 및 사용자 추가 메서드
    private void createRoomAndAddUser(String roomId, UserVO user) {
        RoomVO room = new RoomVO();
        room.addUser(user);
        channel.put(roomId, room);
    }

    // 새로운 사용자가 기존 방에 추가되는 경우
    private void addUserToExistingRoom(String roomId, UserVO user) {
        RoomVO room = channel.get(roomId);
        if (room != null) {
            room.addUser(user);
        }
    }

    // 사용자가 방에서 퇴장하는 경우
    private void removeUserFromRoom(String roomId, UserVO user) {
        RoomVO room = channel.get(roomId);
        if (room != null) {
            room.removeUser(user);
            if (room.getUsers().isEmpty()) {
                channel.remove(roomId);
            }
        }
    }

    // 사용자의 고유한 식별자를 기반으로 방 ID를 동적으로 생성하는 메서드
    private String generateRoomId(String memberId) {
        return "room_" + memberId; // 사용자 ID를 기반으로 한 동적 방 ID 생성
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        users.add(session);

        List<MessageDto> list = messageDao.selectList();
        ObjectMapper mapper = new ObjectMapper();
        for (MessageDto messageDto : list) {
            String json = mapper.writeValueAsString(messageDto);
            TextMessage message = new TextMessage(json);
            session.sendMessage(message);
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        users.remove(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ChatRequestVO requestVO = mapper.readValue(message.getPayload(), ChatRequestVO.class);
        String token = requestVO.getToken();
        String memberId = jwtService.parse(token).getMemberId();
        String memberLevel = jwtService.parse(token).getMemberLevel();

        // 사용자의 채팅 기록 조회 로직
        boolean hasChatHistory = messageDao.hasChatHistory(memberId);

        String roomId;
        if (hasChatHistory) {
            // 채팅 기록이 있는 경우 기존 방에 참여
            roomId = generateRoomId(memberId);
            UserVO user = new UserVO(session);
            addUserToExistingRoom(roomId, user);
        } else {
            // 채팅 기록이 없는 경우 새로운 방 생성 및 사용자 추가
            roomId = generateRoomId(memberId);
            UserVO user = new UserVO(session);
            createRoomAndAddUser(roomId, user);
        }

        //관리자면 특정 회원에게 메세지 전송
        if ("관리자".equals(memberLevel)) {
            String receiverId = requestVO.getReceiverId();
            String receiverLevel = requestVO.getReceiverLevel();

            MessageDto messageDto = messageDao.insert(MessageDto.builder().messageSender(memberId)
                    .messageSenderLevel(memberLevel).messageReceiver(receiverId).messageReceiverLevel(receiverLevel)
                    .messageContent(requestVO.getContent()).build());
            WebSocketSession receiverSession = findUserSession(receiverId);
            if (receiverSession != null) {
                String json = mapper.writeValueAsString(messageDto);
                TextMessage response = new TextMessage(json);
                receiverSession.sendMessage(response);
            }
        }
        //관리자가 아니면 문의 전용 관리자에게 메세지 전송
        else { 
            String adminUserId = "adminuser1"; // 관리자 아이디

            // 메시지 생성 및 전송
            MessageDto messageDto = messageDao.insert(MessageDto.builder().messageSender(memberId)
                    .messageSenderLevel(memberLevel).messageReceiver(adminUserId).messageReceiverLevel("관리자")
                    .messageContent(requestVO.getContent()).build());

            String json = mapper.writeValueAsString(messageDto);
            TextMessage response = new TextMessage(json);
            session.sendMessage(response);
        }
    }

    // 특정 회원의 WebSocket 세션 찾기
    private WebSocketSession findUserSession(String memberId) {
        for (WebSocketSession userSession : users) {
            Map<String, Object> attributes = userSession.getAttributes();
            String userMemberId = (String) attributes.get("memberId");
            if (memberId.equals(userMemberId)) {
                return userSession;
            }
        }
        return null;
    }
}
