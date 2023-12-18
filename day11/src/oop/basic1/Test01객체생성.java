package oop.basic1;

public class Test01객체생성 {

	public static void main(String[] args) {
		//메세지(Message)를 생성해보자!
		//-객체 생성
		
		Message a = new Message();
		//a ---> (복잡한 데이터 덩어리)
		// 		 (sender, content, time, people)
		//		 (결국엔 내가 만든 데이터들이 들어있다)
		
		a.sender = "초롱초롱 라이언";
		a.content = "오늘은 일찍와?";
		a.time = "오후 12:29";
		a.people = 1;
//		a.name = "라이언"; (만들지 않아서 나오지않음)
		
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.time);
		System.out.println(a.people);
		
		//객체 생성
		Message b= new Message();
		
		b.sender = "뽀롱뽀롱 뽀로로";
		b.content = "아니! 늦게갈껀데!";
		b.time = "오후 12:33";
		b.people = 0;
		
		System.out.println(b.sender);
		System.out.println(b.content);
		System.out.println(b.time);
		System.out.println(b.people);
	}

}
