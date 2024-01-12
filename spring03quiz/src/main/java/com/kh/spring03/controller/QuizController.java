package com.kh.spring03.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//등록 코드
public class QuizController {
	/*
	다음 정보로 프로젝트를 생성하세요
	name : spring03quiz
	group : com.kh
	artifact : spring03quiz
	package : com.kh.spring03

	프로젝트에 Spring devtools와 Spring web 라이브러리를 추가하세요

	다음 페이지를 구현(QuizController)
	/dice : 랜덤으로 주사위 번호 1개를 출력
	/lotto : 랜덤으로 로또번호 6개를 출력
	/food : 랜덤으로 본인이 원하는 식사메뉴 중 하나를 출력
	 */
	Random r = new Random();

	@RequestMapping("/dice")
    public String dice() {
        int randomNumber = r.nextInt(6) + 1;
        return "랜덤 주사위 번호: " + randomNumber;
    }
    
    @RequestMapping("/lotto")
    public String lotto() {
    	StringBuffer result = new StringBuffer("랜덤 로또 번호: ");
    	for (int i = 0; i < 6; i++) {
    		result.append(r.nextInt(45) + 1).append(" ");
    	}
    	return result.toString();
    }
    
    @RequestMapping("/food")
    public String food() {
        String[] foodMenu = {"짜장면", "짬뽕", "볶음밥", "김밥", "피자", "초밥"};
        return "랜덤 음식 메뉴: " + foodMenu[r.nextInt(foodMenu.length)];
    }
}
