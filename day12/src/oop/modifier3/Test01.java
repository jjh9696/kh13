package oop.modifier3;

public class Test01 {

	public static void main(String[] args) {

		Phone a = new Phone();
		Phone b = new Phone();
		Phone c = new Phone();
		Phone d = new Phone();
		
		a.data("갤럭시Fold4", "SK", 180,0);
		b.data("갤럭시Fold4", "KT", 175,24);
		c.data("아이폰15", "LG", 200,30);
		d.data("아이폰15", "SK", 199,0);
		
		a.information();
		b.information();
		c.information();
		d.information();
		
		
	}

}
