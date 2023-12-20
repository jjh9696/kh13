package oop.keyword6;

import java.util.Scanner;

public class Test01파이널문제입력추가 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("폭, 높이, 제목을 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
	
		GameScreen a1 = new GameScreen(a, b, c);
		a1.information();
//		System.out.println(GameScreen.resolution(a, b));
		
	}

}
