package condition2;

import java.util.Scanner;

public class Test06날짜계산 {

	public static void main(String[] args) {
/*
		1월부터 12월은 각각 정해진 날짜 수가 존재합니다.
		이를 일반적으로 큰달, 작은달로 표현합니다.

		큰달 - 31일까지 존재하는 달(1,3,5,7,8,10,12월)
		작은달 -30일까지 존재하는 달(4,6,9,11월)
		2월-윤년일 경우 29일, 아닐경우 28일까지 존재)
		
		사용자에게 연도와 월을 입력받아 해당하는 달의 마지막 날짜가 몇일인지 구하여 출력하세요.
*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도 4자리를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
	//	int year = inputYear/100;
	//	int month = inputMonth%100;
		
		boolean check1 = year % 4 == 0;
		boolean check2 = year % 100 != 0; 
		boolean check3 = year % 400 == 0;
		boolean check = check3||(check1 && check2);
		
		int day;
		
		boolean smallMCheck = month==4||month==6||month==9||month==11;
		boolean febCheck = month==2;
		
		if (smallMCheck) {
			day=30;
			System.out.print("작은달)");
		}
		else if (febCheck&&check) {
			day=29;
			System.out.print("윤년)");
		}
		else if (febCheck) {
			day=28;
			System.out.print("윤년아님)");
		}
		else {
			day=31;
			System.out.print("큰달)");
		}
		System.out.println(year+"년 "+month+"월은 "+day+"일까지 있습니다.");
	}

}
