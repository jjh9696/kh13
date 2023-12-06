package data2;

public class Test05PC방계산기풀이 {

	public static void main(String[] args) {
	
	/* 	kh PC방은 다음과 같이 운영하고 있습니다.
	 	-요금은 1시간당 1000원
	 	-분단위로 요금 부과
	 	-단, 10원 단위 까지만 돈을 받는다
	 	
	 	예를 들어서 4분동안 게임을 했다면 66.6666원이 실제 요금이 되지만 60원만 받습니다.
	 	
	 	고객이 12시 20분부터 15시 30분까지 게임을 했을 때 예상 요금을 구하여 출력하세요.
	 */

		int in = 1220;
		int out = 1530;
		
		double unitPrice = 1000;
		
		int inHour = in / 100;
		int inMinute = in % 100;
		int outHour = out / 100;
		int outMinute = out % 100;
		
		int inTime = inHour*60+inMinute; //들어온시간 변환값
		int outTime = outHour*60+outMinute; //나간시간 변환값
		int time = outTime - inTime; //이용시간(분)
		
		int hour = time/60;
		int minute = time%60;
		
		//분당요금
		double minutePrice = unitPrice/60; //숫자 뒤에 d붙이면 더블, (double)unitPrice/60도 사용가능,
		
		int result = (int) (time*minutePrice);
		result = result/10*10;
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println("가격은 " + result + "원 입니다.");
	}

}
