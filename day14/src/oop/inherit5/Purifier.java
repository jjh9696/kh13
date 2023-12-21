package oop.inherit5;

public class Purifier {

	protected String company;
	protected int price;
	//(참고) protected의 "우리"라는 개념에는 "패키지 + 상속그룹"이 포함
	protected Purifier(String company,int price) {
		this.company=company;
		if(price>=0) {
			this.price=price;
		}
	}
	
	public final void normal () {
		System.out.println("normal-정수 1잔 따르기");
	}
	
	public void information() {
		System.out.println("업체명 : "+this.company);
		System.out.println("가격 : "+this.price+"원");
		System.out.println("<기능>");
	}
	
}
