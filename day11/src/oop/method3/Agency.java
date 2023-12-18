package oop.method3;

public class Agency {

	String name, service;
	int price, giga, call, text;
	
	void information() {
		System.out.print("통신사 : "+this.name);
		System.out.print(", 상품명 : "+this.service);
		System.out.println(", 월정액 : "+this.price+"원");
		System.out.print(" 데이터 : "+this.giga+"GB");
		System.out.print(", 통화 : "+this.call+"분");
		System.out.print(", 문자 : "+this.text+"건");
		System.out.println();
		
	}
	
	void data (String name, String service, int price, int giga, int call, int text) {
		this.name = name;
		this.service = service;
		this.price = price;
		this.giga = giga;
		this.call = call;
		this.text = text;
	}
}
