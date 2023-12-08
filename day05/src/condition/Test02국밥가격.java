package condition;

import java.time.LocalDate;
import java.util.Scanner;

public class Test02국밥가격 {

	public static void main(String[] agrs) {
		
	/*	KH국밥집에서는 국밥 한그릇을 7천원에 팔고 있습니다.
		65세 이상 어르신에게는 30% 할인된 가격으로 판매합니다.

		사용자에게 출생년도 8자리를 입력받아 한국나이 계산 후 금액 출력
	 */
		LocalDate current = LocalDate.now();
		int year = current.getYear();
		int gukbobPrice = 7000;
		double discount = 0.3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주문 수량을 입력하세요");
		int gukbob = sc.nextInt(); //입력
		System.out.print("생년월일 8자리를 입력하세요");
		int birth = sc.nextInt(); //입력 8자리
		
		
		int age = year-(birth/10000)+1;
		System.out.println();
		
		
		System.out.println("고객님의 나이는 "+age+"세 입니다.");
		if (age>=65) {
			System.out.println("나이가 65세 이상인 고객분들은 30% 할인됩니다.");
			System.out.println("국밥의 가격은 "+(int)(gukbob*(gukbobPrice-(gukbobPrice*discount)))+"원 입니다.");
		}
		else {
			System.out.println("국밥의 가격은 "+gukbob*gukbobPrice+"원 입니다.");
		}
		
		
		
	}
}
