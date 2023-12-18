package oop.basic2;

public class Test01점수출력 {

	public static void main(String[] args) {

/*
 * 다음 데이터를 클래스로 만들어서 객체 생성 및 초기화, 출력하세요
 * 
 * 이름 : 뽀로로 , 학년 : 1 , 점수 : 70 이름 : 크롱 , 학년 : 1 , 점수 : 55 이름 : 포비 , 학년 : 2 , 점수
 * : 80 이름 : 해리 , 학년 : 2 , 점수 : 75
 */

		
		Student a = new Student();
		a.name = "뽀로로";
		a.grade = 1;
		a.score = 70;

		Student b = new Student();
		b.name = "크롱";
		b.grade = 1;
		b.score = 55;

		Student c = new Student();
		c.name = "포비";
		c.grade = 2;
		c.score = 80;

		Student d = new Student();
		d.name = "해리";
		d.grade = 2;
		d.score = 75;

		System.out.println("<학생정보>");
		System.out.print("이름 : " + a.name);
		System.out.print(", 학년 : " + a.grade);
		System.out.print(", 점수 : " + a.score);
		System.out.println();

		System.out.print("이름 : " + b.name);
		System.out.print(", 학년 : " + b.grade);
		System.out.print(", 점수 : " + b.score);
		System.out.println();
		
		System.out.print("이름 : " + c.name);
		System.out.print(", 학년 : " + c.grade);
		System.out.print(", 점수 : " + c.score);
		System.out.println();
		
		System.out.print("이름 : " + d.name);
		System.out.print(", 학년 : " + d.grade);
		System.out.print(", 점수 : " + d.score);
		
	}
}
