package oop.inherit7;

//이 클래스는 상속에서 상위 클래스 역할을 수행한다
public abstract class Phone {

	private String number;
	public void setNumber(String number) {
		this.number = number;
	}
	public void information() {
		System.out.println("전화번호 : "+this.number);
	}
	
	
	//전화기니까 전화 기능이 있어야겠지...?
	//근데 어떻게 거는지는 아직 모르겠는데...
	public abstract void call();//형태만 정의하고 내용은 정의하지 않음 - 내용은 구현체에서 정의
	public abstract void sms();//구현체에서 재정의를 강제한다


}
