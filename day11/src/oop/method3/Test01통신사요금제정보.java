package oop.method3;

public class Test01통신사요금제정보 {

	public static void main(String[] args) {

		Agency a = new Agency();
		Agency b = new Agency();
		Agency c = new Agency();
		
		a.data("SK", "5G언택트 52", 52000, 200, 1000, 2000);
		b.data("KT", "5G세이브", 45000, 100, 900, 1500);
		c.data("LG", "5G시그니처", 130000, 500, 2000, 2500);
		
		a.information();
		b.information();
		c.information();
		
	}
}
