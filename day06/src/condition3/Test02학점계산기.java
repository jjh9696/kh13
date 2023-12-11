package condition3;

import java.util.Scanner;

public class Test02학점계산기 {

	public static void main(String[] args) {

		/*
		KH대학교에서는 다음 기준에 따라 학점을 계산합니다.
		(시험은 100점이 만점입니다)

		90점 이상 100점 이하라면 A+
		80점 이상 90점 미만이라면 A
		70점 이상 80점 미만이라면 B
		60점 이상 70점 미만이라면 C
		나머지는 F

		시험점수를 입력받아 등급이 출력되도록 프로그래밍 해보세요

		if구문이 아닌 switch구문으로 풀어보세요
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score=sc.nextInt();
		String grade; //System.out.println을 하나로 정리하기 위해 사용
		
		switch(score/10) {
		
		case 9,10:
			grade="A+";
		break;
		case 8:
			grade="A";
		break;
		case 7:s
			grade="B";
		break;
		case 6:
			grade="C";
		break;
		default:
			grade="F";
		break;
		}
		System.out.println("학점 : "+grade);
	}

}
