package io;

import java.util.Scanner;

public class Test06분식점풀이 {

	public static void main(String[] args) {
		/*
		KH분식점의 메뉴판은 다음과 같습니다.

		| 이름 |  가격   |
		| --- | ---    |
		|떡볶이 | 3000원 |
		| 튀김 | 500원  |
		| 순대 | 2000원 |

		사용자에게 떡볶이, 튀김, 순대 개수를 입력받아 결제금액을 출력
		(단, 현재 행사중이라서 10% 할인된 가격으로 판매합니다)
		*/
		
		//입력
		int tteok = 3000;
		int fried = 500;
		int sundae = 2000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("떡볶이 주문수량 : ");
		int tCount = sc.nextInt();
		System.out.print("튀김 주문수량 : ");
		int fCount = sc.nextInt();
		System.out.print("순대 주문수량 : ");
		int sCount = sc.nextInt();
		int rate = 10;
		
		//계산
		int tPrice = tteok * tCount;
		System.out.print("떡볶이 "+tCount+"인분의 가격은 "+tPrice+"원, ");
		int fPrice = fried * fCount;
		System.out.print("튀김 "+fCount+"인분의 가격은 "+fPrice+"원, ");
		int sPrice = sundae * sCount;
		System.out.print("순대 "+sCount+"인분의 가격은 "+sPrice+"원");
		int total = tPrice+fPrice+sPrice;
		int discount = (int)(total*rate/100);
		
		//출력
		System.out.println();
		System.out.print("총 금액 "+total+"원에서 "+rate+"% 할인 된 총 가격은 "+(total-discount)+"원 입니다.");
	}

}
