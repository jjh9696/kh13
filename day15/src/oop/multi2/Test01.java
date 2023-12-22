package oop.multi2;

public class Test01 {

	public static void main(String[] args) {

		Drone a = new Drone();
		Airplane b = new Airplane();
		Train c = new Train();
		Bus d = new Bus();
		Kickboard e = new Kickboard();
		
		a.move();
		a.fly();
		a.on();
		a.off();
		System.out.println();
		b.move();
		b.fly();
		b.reservation();
		System.out.println();
		c.move();
		c.reservation();
		System.out.println();
		d.move();
		System.out.println();
		e.move();
		e.on();
		e.off();
		
	}
}
