package oop.method7;

public class Student {

	int grade, classNum, korean, english, math;
	double average, total;
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
		total = korean+english+math;
		average = total/3;
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+classNum);
		if(korean<40||english<40||math<40||average<60) {
			System.out.println("이름(재평가) : "+name);
		}
		else {
			System.out.println("이름(통과) : "+name);
		}
		System.out.println("국어 : "+korean);
		System.out.println("영어 : "+english);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+(int)total);
		System.out.println("평균 : "+average);
		System.out.println();
	}
	
}
