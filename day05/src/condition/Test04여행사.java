package condition;

import java.util.Scanner;

public class Test04여행사 {

	public static void main(String[] args) {
		/*
		KH여행사에서는 다음과 같은 슬로건을 걸고 영업을 하고 있습니다.
		어디든 무조건 1사람 1박에 10만원

		여름 매출이 너무 저조해서 여름에 여행하는 사람은 추가로 20%할인 행사를 진행합니다.

		사용자에게 인원수, 기간(일), 예정(월)을 입력받아서 예상 금액을 구하여 출력
		(단, 여름은 6,7,8월입니다)
		*/
		
		int price = 100000;
		double sale = 0.2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int people = sc.nextInt();
		System.out.print("여행 기간을 입력하세요 : ");
		int period = sc.nextInt();
		System.out.print("여행 예정일(월)을 입력하세요 : ");
		int month = sc.nextInt();
		
		boolean summer = month==6 || month==7 || month==8;
		int total = people*period*price;
		int saleTotal = (int)(total-total*sale);
		
		
		
		if(summer) {
			System.out.println("인원 "+people+"명, "
								+"기간 "+period+"일, "+"여름 할인가 "
								+saleTotal+"원 입니다.");
		}
		else {
			System.out.println("인원 "+people+"명, "
								+"기간 "+period+"일, "
								+"가격 "+total+"원 입니다.");
		}
		
	}

}
