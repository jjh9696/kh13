package oop.method6;

public class Product {

	 
	String name, category;
	int price;
	boolean dawnDelivery,event;
	
	void data(String name, String category, int price, boolean dawnDelivery, boolean event) {
		this.name=name;
		this.category=category;
		this.price=price;
		this.dawnDelivery=dawnDelivery;
		this.event=event;
	}
	void data(String name, String category, int price, boolean event) {
//		this.name=name;
//		this.category=category;
//		this.price=price;
//		this.dawnDelivery=false;
//		this.event=event;
		this.data(name, category, price, false, event);
	}
	void data(String name, String category, int price) {
//		this.name=name;
//		this.category=category;
//		this.price=price;
//		this.dawnDelivery=false;
//		this.event=false;
		this.data(name, category, price, false, false);
	}
	
	void information() {
		System.out.println("상품명 : "+name);
		System.out.println("상품분류 : "+category);
		double discount=price*0.9;
		int deliveryPrice = 2500;
		if(event){
			System.out.println("가격 : "+(int)discount+"원(행사중 원가 : "+price+"원)");
		}
		else {
			System.out.println("가격 : "+price+"원");
		}
		if(dawnDelivery) {
			System.out.println("새벽배송은 "+deliveryPrice+"원 추가");
		}
		System.out.println();
	}
}
