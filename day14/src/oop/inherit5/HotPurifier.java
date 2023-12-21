package oop.inherit5;

public class HotPurifier extends Purifier{

	public HotPurifier(String company,int price) {
		super(company, price);
	}
	
	public void hot  () {
		System.out.println("hot-온수 1잔 따르기");
	}
}
