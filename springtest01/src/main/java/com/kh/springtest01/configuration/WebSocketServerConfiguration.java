package com.kh.springtest01.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.kh.springtest01.interceptor.JwtHandshakeInterceptor;
import com.kh.springtest01.websocket.ChatbotWebSocketServer;
import com.kh.springtest01.websocket.MemberWebSocketServer;

@EnableWebSocket
@Configuration
public class WebSocketServerConfiguration implements WebSocketConfigurer {

    @Autowired
    private ChatbotWebSocketServer chatbotWebSocketServer;

    @Autowired
    private MemberWebSocketServer memberWebSocketServer;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(chatbotWebSocketServer, "/ws/chatbot/{userId}/{roomId}/websocket")
                .addInterceptors(new JwtHandshakeInterceptor())
                .withSockJS();

        registry.addHandler(memberWebSocketServer, "/ws/member")
                .addInterceptors(new JwtHandshakeInterceptor())
                .withSockJS();
    }
}


