package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring12.service.EmailService;

//스프링 테스트
//-스프링에서 제공하는 테스트를 위한 도구들의 모음
//-자바 진영에서는 JUnit이라는 압도적으로 유명한 테스트 도구가 있다
//-스프링에서는 JUnit을 쓸 수 있도록 연결고리를 제공한다

@SpringBootTest//스프링 테스트 파일임을 표시(기존 환경과 연동됨)
public class SendMailTest03 {
	
	@Autowired
	private EmailService emailService;

	@Test//테스트 케이스임을 표시(메소드 이름은 자유며 형식은 유지해야함)
	public void test() {
		emailService.sendWelcomeMail("cnqzmf@gmail.com");
		

		
	}
}
