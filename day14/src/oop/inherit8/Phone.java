package oop.inherit8;

public abstract class Phone {
//필드
	private String number;
	private String color;
//게터세터
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//생성자 
	public Phone(String number,String color) {
		this.setNumber(number);
		this.setColor(color);
	}
//메소드
	public void show() {
		System.out.println("전화번호 : "+this.number);
		System.out.println("색상 : "+this.color);
		
	
	
	}
}
