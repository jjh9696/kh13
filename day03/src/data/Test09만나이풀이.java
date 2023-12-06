package data;

public class Test09만나이풀이 {

	public static void main(String[] args) {

	/*	오늘은 2023년 12월 6일 입니다
		2000년 1월 1일 생의 만나이를 구하여 출력하세요
		
		단, 생년월일은 '20231206'처럼 8자리의 숫자형태로 제공됩니다.
			일은 고려하지 않고 월까지만 고려합니다.
	*/
		
		//입력
		int current = 20231206;
		int birth = 20000101;
		
		//계산
		int currentYear = current/10000; 	//2023
		int currentMonth = current%10000/100; //12
		int birthYear = birth/10000; 		//2000
		int birthMonth = birth%10000/100;	//1
		
		int now =  currentYear*12+currentMonth;//24288
		int before = birthYear*12+birthMonth;//24001
		int gap = now - before;	//287개월
		
		int age = gap/12;//23살
		
		//출력
		System.out.println("귀하의 만나이는 "+age+"살 입니다.");
		
	}
	

}
