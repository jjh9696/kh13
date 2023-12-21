package oop.inherit7;

//구현체 클래스
public class IPhone15 extends Phone{

	@Override
	public void call() {
		System.out.println("아이폰15 전화기능");
	}

	@Override
	public void sms() {
		System.out.println("아이폰15 문자기능");
		
	}

}
