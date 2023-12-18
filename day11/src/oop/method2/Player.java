package oop.method2;

public class Player {

	//멤버 변수(필드) - 이 객체가 가져야 하는 데이터를 정의
	String name;
	String event;
	String season;
	int gold;
	int silver;
	int bronze;

	//멤버 메소드 - 이 객체가 가지면 좋은 코드를 정의
	void information() {
		System.out.print("이름 : "+this.name);
		System.out.print(", 종목 : "+this.event);
		System.out.println(", 구분 : "+this.season);
		System.out.print(" 금 : "+this.gold+", 은 : "+this.silver+", 동 : "+this.bronze);
		System.out.println();
	}
	
	void data(String name, String event, String season, int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
		
	}
}
