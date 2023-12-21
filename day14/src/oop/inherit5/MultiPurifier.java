package oop.inherit5;

public class MultiPurifier extends Purifier{

	public MultiPurifier(String company,int price) {
		super(company, price);
	}
	
	public void cold  () {
		System.out.println("cold-냉수 1잔 따르기");
	}
	public void hot  () {
		System.out.println("hot-온수 1잔 따르기");
	}
	
}
