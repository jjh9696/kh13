package oop.inherit5;

public class Test01정수기생성 {

	public static void main(String[] args) {

		IcePurifier a = new IcePurifier("코웨이",500000);
		MultiPurifier b = new MultiPurifier("SK매직",650000);
		HotPurifier c = new HotPurifier("쿠쿠", 450000);
//		Purifier d = new Purifier("샘숭",300000);//상위클래스 생성자를 protected로 만들었기 때문에 패키지가 달라지면 생성x  
		
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
