package io;

import java.util.Scanner;

public class Test06분식점 {

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
		
		int tteok = 3000;
		int frid = 500;
		int sundae = 2000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("떡볶이 주문수량 : ");
		int tCount = sc.nextInt();
		System.out.print("튀김 주문수량 : ");
		int fCount = sc.nextInt();
		System.out.print("순대 주문수량 : ");
		int sCount = sc.nextInt();
		
		int tPrice = (tteok * tCount)-(tteok * tCount)/10;
		System.out.print("떡볶이 "+tCount+"인분의 가격은 "+tPrice+"원, ");
		int fPrice = (frid * fCount)-(frid * fCount)/10;
		System.out.print("튀김 "+fCount+"인분의 가격은 "+fPrice+"원, ");
		int sPrice = (sundae * sCount)-(sundae * sCount)/10;
		System.out.print("순대 "+sCount+"인분의 가격은 "+sPrice+"원");
	}

}
