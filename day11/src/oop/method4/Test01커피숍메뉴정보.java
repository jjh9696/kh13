package oop.method4;

public class Test01커피숍메뉴정보 {

	public static void main(String[] args) {

		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		
		a.data("아메리카노", "음료", 2500, "행사중");
		b.data("모카라떼", "음료", 3500, "");
		c.data("치즈케이크", "디저트", 5000, "행사중");
		d.data("마카롱", "디저트", 3000, "");
		
		a.information();
		b.information();
		c.information();
		d.information();
	}

}
