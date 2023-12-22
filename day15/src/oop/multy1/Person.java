package oop.multy1;

//인터페이스는 클래스와 상속 키워드가 다르다
public class Person /*extends 클래스*//*핵심상속*/ implements Singer, Comedian/*부가상속*/{

	@Override
	public void gag() {
		System.out.println("개그");
	}

	@Override
	public void sing() {
		System.out.println("노래");
		
	}
	

	
}
