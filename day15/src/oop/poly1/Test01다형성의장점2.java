package oop.poly1;

import java.util.Random;

public class Test01다형성의장점2 {
	public static void main(String[] args) {
	
		//(Q) 랜덤으로 아이폰14나 15중 하나를 추첨
		
		Random r = new Random();
		//약속 : 아피폰14(0), 아이폰15(1)
		
		int choice = r.nextInt(2)+0;//0부터 2개
		IPhone phone;
		
		if(choice==0) {
			//아이폰 14 객체 생성
			phone = new IPhone14();//IPhone14 -> IPhone (업캐스팅)
			phone.call();
			phone.sms();
		}
		else {
			phone = new IPhone15();//IPhone15 -> IPhone (업캐스팅)
			phone.call();
			phone.sms();
		}
		//생성 후에도 Phone 객체를 사용할 수 있다
		phone.call();
		phone.sms();
	}
}
