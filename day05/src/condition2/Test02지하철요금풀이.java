package condition2;

import java.util.Scanner;

public class Test02지하철요금풀이 {

	public static void main(String[] args) {
		/*
		지하철 이용요금이 다음과 같을 때 사용자의 나이를 입력받아 지하철 요금을 출력하세요
		
		어르신 - 65세 이상 - 무료
		성인 - 20세 이상 65세 미만 - 1400원
		청소년 - 14세 이상 20세 미만 - 800원
		어린이 - 8세 이상 14세 미만 - 500원
		영유아 - 8세 미만 - 무료
		
		(추가) 카드보증금 500원을 추가해서 계산하고 출력하세요
		*/
		
		int adultFare = 1400;
		int teenFare = 800;
		int childFare = 500;
		int cardDeposit = 500;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		int price;
		
		if (age >= 65 ||age < 8) {
			price = 0;
		}
		else if (age >= 20) {
			price = 1400;
		}
		else if (age >= 14) {
			price = 800;
		}
		else {
			price = 500;
		}
		
		int result = price+cardDeposit;
		System.out.println("지하철 요금 : " + price + "원");
		System.out.println("카드 보증금 : " + cardDeposit + "원");
		System.out.println("결제 요금 : " + result + "원");
	}

}
