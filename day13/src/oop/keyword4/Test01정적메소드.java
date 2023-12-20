package oop.keyword4;

import java.util.Scanner;

public class Test01정적메소드 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("사각형 한 변의 길이 입력 : ");
		double side = sc.nextInt();
		System.out.println("한 변의 길이가 "+side+"인 사각형의 넓이 : "+Robot.square(side));
		
		System.out.print("삼각형의 밑 변 길이 입력 : ");
		double width = sc.nextInt();
		System.out.print("삼각형의 높이 입력 : ");
		double height = sc.nextInt();
		System.out.println("밑 변의 길이가 "+width+", 높이가 "+height+"인 삼각형의 넓이 : "+Robot.triangle(width, height));
		
		System.out.print("원의 반지름 길이 입력 : ");
		double radius = sc.nextInt();
		System.out.println("반지름이 "+radius+"인 원의 넓이: "+Robot.circle(radius));
		
		System.out.print("출생년도 4자리 입력 : ");
		int year = sc.nextInt();
		System.out.println("지하철 요금 : "+Robot.subway(year)+"원");
		
		System.out.print("윤년인지 확인할 연도 4자리 입력 : ");
		year = sc.nextInt();
		if (Robot.leap(year)){
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
		
		System.out.print("키를 입력하세요 : ");
		double cm = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double kg = sc.nextDouble();
		System.out.println("BMI지수는 : "+Robot.bmi(cm,kg));
	}

}
