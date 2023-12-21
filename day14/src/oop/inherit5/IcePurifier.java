package oop.inherit5;

public class IcePurifier extends Purifier{

	public IcePurifier(String company,int price) {
		super(company, price);
	}
	
	public void cold  () {
		System.out.println("cold-냉수 1잔 따르기");
	}
	public void ice  () {
		System.out.println("ice-얼음 나옴");
	}
	
	
}
