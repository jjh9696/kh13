package oop.constructor2;

public class Test01음원차트 {

	public static void main(String[] args) {

		Chart a = new Chart("Perfect Night", "르세라핌", 104250, 91835);
		Chart b = new Chart("첫 눈", "EXO", 83127, 90805);
		Chart c = new Chart("Drama", "aespa", 64590, 174519);
		Chart d = new Chart("To.X", "태연", 58826, 70313);
		
		a.information();
		b.information();
		c.information();
		d.information();
		
	}
}
