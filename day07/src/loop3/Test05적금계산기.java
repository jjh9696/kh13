package loop3;

public class Test05적금계산기 {

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
		int money = 100000;
		double interest = 0.03;
		int year = 3;
		
		for(int i=1;i<=year*12;i++) {
			if (i%12==0) {
				System.out.print("이자"+(money*interest)+"원 추가 ");
				money += money*interest;
			}
			System.out.println(i+"개월 잔액"+money);
			money += 100000;
		}
		System.out.println("총 금액"+(money-100000));
	}

}
