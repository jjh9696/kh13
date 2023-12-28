package api.lang.exception;

public class Test09예외전가 {

	public static void main(String[] args) throws InterruptedException {

//		throws InterruptedException (예외처리를 안하겠다)
		
		//throw - 프로그램 멈추고 플랜B로 가라
		//throws - 나는 매우 위험한 메소드다(플랜B가 없으면 사용할 수 없음)
		
		System.out.println("시작!");
		
		//Plan B가 없으면 부를 수 없는 위험한 메소드
		Thread.sleep(3000L);
		
		System.out.println("종료!");
	}

}
