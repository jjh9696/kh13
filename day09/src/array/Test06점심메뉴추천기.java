package array;

import java.util.Random;
import java.util.Scanner;

public class Test06점심메뉴추천기 {

	public static void main(String[] args) {
		/*
		사용자에게 5가지의 점심메뉴를 입력받아 배열에 저장한 뒤 무작위로 한 개를 골라 출력하도록 프로그램을 구현하세요

		입력 : 자장면
		입력 : 피자
		입력 : 육개장
		입력 : 회덮밥
		입력 : 떡볶이

		오늘은 "육개장"을 드시죠!
		*/
		Random r = new Random();
		int num = r.nextInt(5);
		Scanner sc = new Scanner(System.in);
		String[] menu = new String[5];
		
		System.out.println("먹고 싶은 메뉴 5개를 입력하세요");
		for (int i=0;i<5;i++) {
			menu[i] = sc.next();
		}
		System.out.println("오늘 점심 메뉴는~"+menu[num]+"!");
	}
}
