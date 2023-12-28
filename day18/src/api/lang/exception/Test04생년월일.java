package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일 {

	public static void main(String[] args) {

		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력하세요(YYYY-MM-DD 형식으로 입력) : ");
		String birth = sc.nextLine();
			
		String regex="^(19[0-9][0-9]|20[0-9][0-9])-((0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]))$";
		if(birth.matches(regex) == false) {
			throw new Exception();
		}
		
		int year =Integer.parseInt(birth.substring(0,4));
		int month =Integer.parseInt(birth.substring(5,7));
//		int day =Integer.parseInt(birth.substring(8,10));
		int day =Integer.parseInt(birth.substring(8));
		
		if (birth.matches(regex)) {
			System.out.println("출생년도 :"+year+"년");
			System.out.println("출생월 :"+month+"월");
			System.out.println("출생일 :"+day+"일");
		}
		}
		catch(Exception e) {//Plan B
				System.err.println("입력이 잘못되었습니다.");
		}
	}
}
