package com.kh.spring19;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring19.dto.MemberDto;
import com.kh.spring19.service.JwtService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class JwtTest02 {
	
	@Autowired
	private JwtService jwtService;
	
	@Test
	public void test() {
		String token = jwtService.create(MemberDto.builder()
				.memberId("testuser1")
				.memberLevel("일반회원")
				.build());
		log.debug("token = {}", token);
	}
}
