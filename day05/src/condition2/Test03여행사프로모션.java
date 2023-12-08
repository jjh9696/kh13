package condition2;

import java.util.Scanner;

public class Test03여행사프로모션 {

	public static void main(String[] args) {
		/*
		KH 여행사에서 두 번째 프로모션을 진행합니다.
		무조건 1인당 1일 10만원이라는 기존의 슬로건은 유지하면서 계절별로 다양하게 추가 할인을 제공합니다.
		
		봄-3,4,5월 , 할인율 20%
		여름-6,7,8월 , 할인율 10%
		봄-9,10,11월 , 할인율 30%
		봄-12,1,2월 , 할인율 5%
		
		사용자에게 인원수, 여행기간(일), 예정(월)을 입력받아 예상 요금을 출력하세요
		*/
		
		int price = 100000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int people = sc.nextInt();
		System.out.print("여행 기간(일)을 입력하세요 : ");
		int period = sc.nextInt();
		System.out.print("여행 예정일(월)을 입력하세요 : ");
		int month = sc.nextInt();
		
		int sale;
		int total = people*period*price;
		
		boolean spring = month==3 || month==4 || month==5;
		boolean summer = month==6 || month==7 || month==8;
		boolean fall = month==9 || month==10 || month==11;
	//	boolean winter = month==12 || month==1 || month==2;
		
		System.out.println("가격은 "+total+"원 입니다");
		
		if (spring) {
			sale = 20;
			System.out.println("봄 할인 "+sale+"% 적용");
		}
		else if (summer) {
			sale = 10;
			System.out.println("여름 할인 "+sale+"% 적용");
		}
		else if (fall) {
			sale = 30;
			System.out.println("가을 할인 "+sale+"% 적용");
		}
		else {
			sale = 5;
			System.out.println("겨울 할인 "+sale+"% 적용");
		}
		int discountAmount = (int)(total*sale/100);
		System.out.println("할인액은 "+discountAmount+"원 입니다");
		System.out.println("최종 가격은 "+(total-discountAmount)+"원 입니다");
	}
}
