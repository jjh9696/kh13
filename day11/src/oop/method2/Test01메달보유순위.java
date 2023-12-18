package oop.method2;

public class Test01메달보유순위 {

	public static void main(String[] args) {

		Player a = new Player();
		Player b = new Player();
		Player c = new Player();
		
		a.data("진종오", "사격", "하계", 4, 2, 0);
		b.data("김수녕", "양궁", "하계", 4, 1, 1);
		c.data("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		a.information();
		b.information();
		c.information();
		
	}
}
