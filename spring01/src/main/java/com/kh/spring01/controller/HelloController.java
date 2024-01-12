package com.kh.spring01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//페이지를 생성하는 도구
@RestController
public class HelloController {

	// http://localhost:8080/home
	@RequestMapping("/home")
	public String home() {
		return "hello Spring Boot!";
	}
	
	// http://localhost:8080/kh	
	@RequestMapping("/kh")
	public String kh() {
		return "KH정보교육원";
	}
	
	
}
