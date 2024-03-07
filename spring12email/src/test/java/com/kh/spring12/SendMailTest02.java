package com.kh.spring12;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//스프링 테스트
//-스프링에서 제공하는 테스트를 위한 도구들의 모음
//-자바 진영에서는 JUnit이라는 압도적으로 유명한 테스트 도구가 있다
//-스프링에서는 JUnit을 쓸 수 있도록 연결고리를 제공한다

@SpringBootTest//스프링 테스트 파일임을 표시(기존 환경과 연동됨)
public class SendMailTest02 {
	
	@Autowired
	private JavaMailSenderImpl sender;

	@Test//테스트 케이스임을 표시(메소드 이름은 자유며 형식은 유지해야함)
	public void test() {
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo("cnqzmf@gmail.com");
		message.setSubject("햄버거먹어");
		message.setText("왕햄버거먹어");
		
		//전송
		sender.send(message);
		

		
	}
}
