package api.lang.string2;

import java.util.Scanner;

public class Test05날짜검사 {

	public static void main(String[] args) {

		//사용자에게 생년월일을 입력받아서 올바른 형식인지 검사 후 출력
//		요구사항
//		연도는 1900 부터 2099년 사이에서 설정 (1900~2099)
//		월은 1월부터 12월 사이에서 설정 (01~12)
//		일은 월에 따라 다르긴 하지만 우선 31일로 고정 (01~31)
//		형식은 YYYY-MM-DD 형태로 대시가 포함된다.
//
//		업그레이드
//		월에 따라 날짜가 다르게 설정되도록 구현(2월은 29일로 가정)
//		윤년인지 아닌지 프로그램에서 판정하여 정규표현식에 반영(윤년설정을 넣으면 2월은 28일 윤년이면 29일)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력하세요 : ");
		String birth = sc.nextLine();
		
		String regex="^(19[0-9][0-9]|20[0-9][0-9])((0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01]))$";
		
		if (birth.matches(regex)) {
			
			int year =Integer.parseInt(birth.substring(0,4));
			int month =Integer.parseInt(birth.substring(4,6));
			int day =Integer.parseInt(birth.substring(6,8));
		
			boolean isLeapYear =year % 400 == 0||(year % 4 == 0&&year % 100 != 0);
		
			switch (month) {
				case 2:
					if (isLeapYear) {
						System.out.println(year+"-"+month+"-"+day+ "은 윤년이고, " + month + "월은 29일까지 있습니다.");
					} 
					else {
						System.out.println(year+"-"+month+"-"+day + "은 윤년이 아니고, " + month + "월은 28일까지 있습니다.");
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println(year+"-"+month+"-"+day + "은 " + month + "월은 30일까지 있습니다.");
					break;
				default:
					System.out.println(year+"-"+month+"-"+day + "은 " + month + "월은 31일까지 있습니다.");
					break;
			}
		} 
		else {
			System.out.println("올바른 날짜 형식이 아닙니다.");
		}
		
	}

}
