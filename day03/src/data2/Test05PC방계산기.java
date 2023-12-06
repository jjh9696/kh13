package data2;

public class Test05PC방계산기 {

	public static void main(String[] args) {
	
	/* 	kh PC방은 다음과 같이 운영하고 있습니다.
	 	-요금은 1시간당 1000원
	 	-분단위로 요금 부과
	 	-단, 10원 단위 까지만 돈을 받는다
	 	
	 	예를 들어서 4분동안 게임을 했다면 66.6666원이 실제 요금이 되지만 60원만 받습니다.
	 	
	 	고객이 12시 20분부터 15시 30분까지 게임을 했을 때 예상 요금을 구하여 출력하세요.
	 */

		double pricePerHour = 1000;
		int startHour = 12;
		int startMinute = 20;
		int finishHour = 15;
		int finishMinute = 30;
		
		int startTime = startHour*60+startMinute; //시작시간
		int finishTime = finishHour*60+finishMinute; //종료시간
		int playTime = finishTime - startTime; //이용시간
		
		double pricePerMin = pricePerHour/60; //분당요금
		
		int price = (int) (playTime*pricePerMin)/10*10;
		
		System.out.println("가격은 " + price + "원 입니다.");
	}

}
