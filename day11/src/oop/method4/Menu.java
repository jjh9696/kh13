package oop.method4;

public class Menu {

	String name, category, event;
	int price;
	
	
	
	void information( ) {
		System.out.println("이름 : " +name);
		System.out.println("분류 : " +category);
		System.out.println("가격 : " +price+"원");
		System.out.println();
		
	}
	
	void data (String name, String category, int price, String event) {
		if (event=="행사중") {
			price*=0.8;
			name=name+("(행사중)");
		}
		this.name=name;
		this.category=category;
		this.price=price;
		this.event=event;
		
	}
}
