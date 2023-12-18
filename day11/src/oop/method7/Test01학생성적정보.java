package oop.method7;

public class Test01학생성적정보 {

	public static void main(String[] args) {

		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		Student d = new Student();
		
		a.data(1, 1, "마리오", 50, 60, 50);
		b.data(1, 1, "루이지", 60, 90, 50);
		c.data(1, 2, "쿠파", 70, 70, 80);
		d.data(1, 2, "요시", 80, 85, 35);
		
		a.information();
		b.information();
		c.information();
		d.information();
	}

}
