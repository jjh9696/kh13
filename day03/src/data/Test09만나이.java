package data;

public class Test09만나이 {

	public static void main(String[] args) {

	/*	오늘은 2023년 12월 6일 입니다
		2000년 1월 1일 생의 만나이를 구하여 출력하세요
		
		단, 생년월일은 '20231206'처럼 8자리의 숫자형태로 제공됩니다.
			일은 고려하지 않고 월까지만 고려합니다.
	*/
		
		int today = 20231206;
		int age = 20000101;
		
		int todayMonth = today/100;
		int ageMonth = age/100;
		
		int minus = todayMonth-ageMonth; //2311
		int minusYear = minus/100; //23년
		int minusMonth = minus%100; //11개월
		int month = minusYear*12+minusMonth; //287개월
		
		int realAge = month/12;
		
		System.out.println("귀하의 만나이는 "+realAge+"살 입니다.");
		
	}
	

}
