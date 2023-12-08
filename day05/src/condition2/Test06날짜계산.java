package condition2;

import java.util.Scanner;

public class Test06날짜계산 {

	public static void main(String[] args) {
/*
		1월부터 12월은 각각 정해진 날짜 수가 존재합니다.
		이를 일반적으로 큰달, 작은달로 표현합니다.

		큰달
		작은달
		2월
		
		사용자에게 연도와 월을 입력받아 해당하는 달의 마지막 날짜가 몇일인지 구하여 출력하세요.
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("연도와 월을 6자리로 입력하세요");
		
		int input = sc.nextInt();
		int month = input%100;
		
		int bigMonth = 31;
		int smallMonth = 30;
		int february = 28;
		
		boolean smallMCheck = month==4||month==6||month==9||month==11;
		boolean febCheck = month==2;
		
		if (smallMCheck) {
			System.out.println(month+"월은 작은 달 입니다. "+smallMonth+"일까지 있습니다.");
		}
		else if (febCheck) {
			System.out.println(month+"월 입니다. "+february+"일까지 있습니다.");
		}
		else {
			System.out.println(month+"월은 큰 달 입니다. "+bigMonth+"일까지 있습니다.");
		}
		
	}

}
