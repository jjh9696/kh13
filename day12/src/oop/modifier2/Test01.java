package oop.modifier2;

public class Test01 {

	public static void main(String[] args) {

		Lecture a = new Lecture();
		Lecture b = new Lecture();
		Lecture c = new Lecture();
		
		a.data("자바 마스터 과정", 90, 1000000, "온라인");
		b.data("파이썬 기초", 60, 600000, "온라인");
		c.data("웹 개발자 단기완성", 120, 1200000, "오프라인");
		
		a.information();
		b.information();
		c.information();
	}

}
