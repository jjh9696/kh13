package oop.method4;

public class Menu {

	String name, category, event;
	int price;
	
	
	
	void information( ) {
		if (this.event=="행사중") {
			name=name+("(행사중)");
		}
		System.out.println("이름 : " +name);
		System.out.println("분류 : " +category);
		if (this.event=="행사중") {
			int discount = this.price * 80 / 100;
			System.out.println("가격 : "+discount+"원 (원가 :"+price+"원)" );
		}
		else {
			System.out.println("가격 : " +price+"원");
		}
		System.out.println();
		
	}
	
	void data (String name, String category, int price, String event) {
		this.name=name;
		this.category=category;
		this.price=price;
		this.event=event;
		
	}
}
