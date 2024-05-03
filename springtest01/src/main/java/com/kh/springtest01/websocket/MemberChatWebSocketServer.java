package com.kh.springtest01.websocket;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.springtest01.dao.MessageDao;
import com.kh.springtest01.dto.MessageDto;
import com.kh.springtest01.service.JwtService;
import com.kh.springtest01.vo.ChatRequestVO;

@Service
public class MemberChatWebSocketServer extends TextWebSocketHandler {

    @Autowired
    private MessageDao messageDao;
    
    @Autowired
    private JwtService jwtService;
    
    private Set<WebSocketSession> users = new CopyOnWriteArraySet<>();
    
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        users.add(session);
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
        

        MessageDto messageDto = messageDao.insert(MessageDto.builder()
	            .messageSender(memberId.toString()) // 회원의 경우 memberId를 문자열로 변환하여 저장
	            .messageContent(requestVO.getContent())
            .build());
            
        
    }
  
}
