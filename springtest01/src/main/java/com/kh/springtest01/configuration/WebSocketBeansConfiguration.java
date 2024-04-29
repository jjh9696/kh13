package com.kh.springtest01.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kh.springtest01.websocket.ChatbotWebSocketServer;
import com.kh.springtest01.websocket.MemberWebSocketServer;

@Configuration
public class WebSocketBeansConfiguration {

    @Bean
    public ChatbotWebSocketServer chatbotWebSocketServer() {
        return new ChatbotWebSocketServer();
    }

    @Bean
    public MemberWebSocketServer memberWebSocketServer() {
        return new MemberWebSocketServer();
    }
}
