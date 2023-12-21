package oop.inherit8;

public class IPhone14 extends ApplePhone{

	public IPhone14(String number, String color) {
		super(number, color);
	}
	@Override
	public void call() {
		System.out.println("IPhone14 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("IPhone14 문자 기능 실행");
	}
	@Override
	public void siri() {
		System.out.println("IPhone14 음성인식 기능 실행");
	}
	public void itunes() {
		System.out.println("IPhone14 아이튠즈 기능 실행");
	}

}
