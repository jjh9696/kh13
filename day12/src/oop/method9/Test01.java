package oop.method9;

public class Test01 {

	public static void main(String[] args) {

		Save a=new Save();
		Save b=new Save();
		Save c=new Save();
		
		a.data("유재석", 2.20, 1, 500000, 2);
		b.data("강호동", 2.50, 1, 500000, 2);
		c.data("신동엽", 2.35, 1.50, 600000, 3);
		
		a.information();
		b.information();
		c.information();
	}

}
