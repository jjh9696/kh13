package oop.inherit8;

public abstract class GalaxyPhone extends Phone{

	
	public GalaxyPhone(String number, String color) {
		super(number, color);
	}
	public abstract void call();
	public abstract void sms();
	public abstract void samsungPay();
}
