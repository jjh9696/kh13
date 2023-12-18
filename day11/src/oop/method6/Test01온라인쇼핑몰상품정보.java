package oop.method6;

public class Test01온라인쇼핑몰상품정보 {

	public static void main(String[] args) {

		Product a = new Product();
		Product b = new Product();
		Product c = new Product();
		Product d = new Product();
		
		a.data("참이슬후레쉬", "주류", 1200, true, true);
		b.data("클라우드맥주", "주류", 3000, true);//오버로딩을 해서 false를 생략하고 입력했다
		c.data("바나나킥", "과자", 1500, true);//오버로딩을 해서 false를 생략하고 입력했다
		d.data("허니버터칩", "과자", 2000, true,false);
		
		a.information();
		b.information();
		c.information();
		d.information();
		
	}
}
