package com.kh.springtest01.interceptor;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Component
public class JwtHandshakeInterceptor implements HandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        // 여기서 JWT 토큰을 추출하고 유효성을 검사합니다.
        String token = extractToken(request);
        if (isValidToken(token)) {
            // 토큰이 유효하면 WebSocket 세션의 속성으로 토큰을 저장할 수 있습니다.
            attributes.put("token", token);
            return true; // 연결 허용
        } else {
            return false; // 연결 거부
        }
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
        // 연결 후처리가 필요하지 않으면 아무 작업도 하지 않아도 됩니다.
    }

    // 실제로 JWT 토큰을 추출하는 메서드
    private String extractToken(ServerHttpRequest request) {
        // request에서 JWT 토큰을 추출하는 로직을 구현하세요.
        // 예를 들어, HTTP 헤더에서 추출하는 방법:
        String authorizationHeader = request.getHeaders().getFirst("Authorization");
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            return authorizationHeader.substring(7); // "Bearer " 이후의 부분이 토큰입니다.
        }
        return null; // 토큰을 찾을 수 없는 경우
    }

    // 추출된 토큰의 유효성을 검사하는 메서드
    public boolean isValidToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256("your_secret");
            JWT.require(algorithm).build().verify(token);
            return true;
        } catch (JWTVerificationException exception){
            return false;
        }
    }
    
    
}
