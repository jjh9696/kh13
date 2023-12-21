package oop.inherit5;

public class Test01정수기생성 {

	public static void main(String[] args) {

		IcePurifier a = new IcePurifier("코웨이",500000);
		MultiPurifier b = new MultiPurifier("SK매직",650000);
		HotPurifier c = new HotPurifier("쿠쿠", 450000);
		
		a.information();
		a.normal();
		a.cold();
		a.ice();
		System.out.println();
		b.information();
		b.normal();
		b.cold();
		b.hot();
		System.out.println();
		c.information();
		c.normal();
		c.hot();
	
		
	}
}
