package oop.inherit8;

public class Test01 {

	public static void main(String[] args) {

		Galaxy23FE p1=new Galaxy23FE("010-1111-1111", "black");
		GalaxyFold5 p2 = new GalaxyFold5("010-2222-2222", "gold");
		IPhone14 p3 =new IPhone14("010-3333-3333", "white");
		IPhone15 p4 =new IPhone15("010-4444-4444", "blue");
		
		p1.show();
		p1.call();
		p1.sms();
		p1.samsungPay();
		p1.bixby();
		System.out.println();
		p2.show();
		p2.call();
		p2.sms();
		p2.samsungPay();
		p2.iris();
		System.out.println();
		p3.show();
		p3.call();
		p3.sms();
		p3.itunes();
		p3.siri();
		System.out.println();
		p4.show();
		p4.call();
		p4.sms();
		p4.faceTime();
		p4.siri();
	}

}
