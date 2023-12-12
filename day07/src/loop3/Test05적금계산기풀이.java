package loop3;

public class Test05적금계산기풀이 {

	public static void main(String[] args) {
		/*
		KH은행에서는 다음과 같이 적금상품을 운영하고 있습니다.

		사용자가 정한 금액을 매월 입금받는다
		이자는 12개월이 되는 순간 지급된다
		이자는 3%이며 복리로 계산된다
		사용자가 정한 기간(년)만큼 동일한 과정을 반복한다.

		기간(년) 입력 : 3
		월부금(원) 입력 : 100000

		1년차
		원금 : 1200000원 , 이자 : 36000원 , 잔액 : 1236000원

		2년차
		원금 : 2436000원 , 이자 : 73080원 , 잔액 : 2509080원

		3년차
		원금 : 3709080원 , 이자 : 111272원 , 잔액 : 3820352원
		*/
		
		int year = 3;//년으로 바꿔서 푸는것이 덜 어렵다
		int money = 100000; //월부금
		
		int origin = money * 12; //연부금
		
		for(int i=1;i<=year;i++) {
			int interest = origin*3/100;//원금의 3%
			int balance = origin + interest;//원금+이자
			
			System.out.println(i+"년차 현황");
			System.out.println("원금 : "+origin+"원, 이자 :"+interest+"원, 잔고 : "+balance+"원");
			System.out.println();
		//데이터 변화
		//-다음회차 원금은 현재 잔고에 연부금(월부금*12)를 더한 값이다
			origin=balance+money*12;
		}
	}

}
