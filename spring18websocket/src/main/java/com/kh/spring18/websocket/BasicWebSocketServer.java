package com.kh.spring18.websocket;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

/*
	웹소켓 접속 및 메세지 전송을 중계하는 서버
	-상속을 받아서 자격을 획득 (WebSocketHandler / TextWebSocketHandler / BinaryWebSocketHandler)
		(WebSocketHandler(부모클래스) / TextWebSocketHandler, BinaryWebSocketHandler(자식클래스 - 이름에 WebSocketHandler이 포함된 걸 보면 쉽게 알 수 있다)
	-@service로 등록하여 사용
	-필요한 메소드를 재정의하여 사용 (연결수립/연결	-	메세지 주고받음		-	연결해제)
		-afterConnectionEstablished - 사용자가 접속했을 때 실행되는 메소드
		-afterConnectionClosed - 사용자가 접속을 종료했을 때 실행되는 메소드
		-handelTextMessage - 사용자가 메세지를 전송했을 때 실행되는 메소드
*/

@Slf4j
@Service
public class BasicWebSocketServer extends TextWebSocketHandler{
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		log.debug("사용자가 접속했어요");
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		log.debug("사용자가 접속 종료했어요");
	}

}
