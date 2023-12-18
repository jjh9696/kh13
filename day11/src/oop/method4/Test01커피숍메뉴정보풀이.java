package oop.method4;

public class Test01커피숍메뉴정보풀이 {
	public static void main(String[] args) {
		
		Menu1 a = new Menu1();
		Menu1 b = new Menu1();
		Menu1 c = new Menu1();
		Menu1 d = new Menu1();
		
		a.data1("아메리카노", "음료", 2500, true);
		b.data1("모카라떼", "음료", 3500, false);
		c.data1("치즈케이크", "디저트", 5000, true);
		d.data1("마카롱", "디저트", 3000, false);
		
		a.information();
		b.information();
		c.information();
		d.information();
		
	}
}