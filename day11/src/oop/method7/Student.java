package oop.method7;

public class Student {

	int grade, classNum, korean, english, math;
	String name;

	void data(int grade,int classNum,String name,int korean,int english,int math) {
		this.grade = grade;
		this.classNum = classNum;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	void information() {
		double total = this.korean+this.english+this.math;
		double average = total/3;
		System.out.println("학년 : "+this.grade);
		System.out.println("반 : "+this.classNum);
		if(this.korean<40||this.english<40||this.math<40||average<60) {
			System.out.println("이름(재평가) : "+this.name);
		}
		else {
			System.out.println("이름(통과) : "+this.name);
		}
		System.out.println("국어 : "+this.korean);
		System.out.println("영어 : "+this.english);
		System.out.println("수학 : "+this.math);
		System.out.println("총점 : "+(int)total);
		System.out.println("평균 : "+average);
		System.out.println();
	}
}
