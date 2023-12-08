package condition2;

import java.util.Scanner;

public class Test02지하철요금 {

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
		
		boolean oldCheck = age >= 65;
		boolean adultCheck = age >= 20 && age < 65;
		boolean teenCheck = age >= 14 && age < 20;
		boolean childCheck = age >= 8 && age < 14;
		
		if (oldCheck) {
			System.out.println("65세 이상의 요금은 "+cardDeposit+"원 입니다.");
		}
		else if (adultCheck) {
			System.out.println("성인 요금은 카드보증금 500원 포함 "+(adultFare+cardDeposit)+"원 입니다.");
		}
		else if (teenCheck) {
			System.out.println("청소년 요금은 카드보증금 500원 포함 "+(teenFare+cardDeposit)+"원 입니다.");
		}
		else if (childCheck) {
			System.out.println("어린이 요금은 카드보증금 500원 포함 "+(childFare+cardDeposit)+"원 입니다.");
		}
		else {
			System.out.println("8세 미만의 요금은 "+cardDeposit+"원 입니다.");
		}
	}

}
