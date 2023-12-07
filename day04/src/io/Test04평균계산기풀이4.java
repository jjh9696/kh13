package io;

import java.util.Scanner;

public class Test04평균계산기풀이4 {

	public static void main(String[] args) {

		
	/*
		사용자에게 다음 정보를 입력받아서 총점과 평균을 구하여 출력

		국어 점수(korean)
		영어 점수(english)
		수학 점수(math)
	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요. : ");
		double korean = sc.nextDouble();
		System.out.print("영어점수를 입력하세요. : ");
		double english = sc.nextDouble();
		System.out.print("수학점수를 입력하세요. : ");
		double math = sc.nextDouble();
		
		double total = korean+english+math;
		double aver = (korean+english+math)/3;
		
		System.out.println("총점은 " + total + "점 이고, 평균은 " + aver + "점 입니다.");
		
	}

}
