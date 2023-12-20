package oop.constructor3;

import java.util.Scanner;

public class Test01게임캐릭터정보 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String a = sc.next();
		System.out.print("직업을 입력하세요(전사, 도적, 마법사 中 1택) : ");
		String b = sc.next();
		System.out.println();
		
		Game a1 = new Game(a, b);
		
		//레벨업
//		int level = a1.getLevel();
//		a1.setLevel(level + 1);
		
		a1.levelUp();
		
		a1.information();
		
	}
}
