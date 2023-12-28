package api.lang.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Test07만나이계산기 {

	public static void main(String[] args) {
		/*
		사용자에게 생년월일을 YYYY-MM 형식으로 입력받습니다.
		이 사용자의 한국나이와 만나이를 구하여 출력
		만나이는 태어난 달이거나 해당 달이 지나면 1살을 추가하는 방식으로 구현

		예를들어 2000년 1월이면 1월이 되면 한 살이 늘어납니다


		처리를 하면서 문제가 되는 상황이 발생하면 상황에 맞는 에러메세지를 출력
		예상 가능한 문제상황들은 다음과 같습니다.

		1.입력이 너무 짧은 경우
		2.숫자 변환이 올바로 되지 않는 경우
		3.생년월일을 미래의 값으로 입력하는 경우
		4.월을 1~12로 입력하지 않은 경우
		5.연도가 1900 미만인 경우

		한 개의 catch 블록으로 모든 예외를 처리할 수 있도록 구현하세요
		*/
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("생년월일을 YYYY-MM 형식으로 입력하세요 : ");
			String birth = sc.nextLine();
			LocalDate today = LocalDate.now();
		
			int todayYear =Integer.parseInt(today.toString().substring(0,4));
			int todayMonth =Integer.parseInt(today.toString().substring(5,7));
			int year =Integer.parseInt(birth.substring(0,4));
			int month =Integer.parseInt(birth.substring(5,7));
			String regex="^(19[0-9][0-9]|20[0-9][0-9])-(0[1-9]|1[0-2])";
		
			if (birth.length() < 7) {//입력이 너무 짧은 경우
				throw new Exception("입력이 너무 짧습니다.");
			}
			if(birth.matches(regex) == false) {//숫자 변환이 올바로 되지 않는 경우
				throw new Exception("올바른 형식으로 입력해주세요.");
			}
			if(year>todayYear||(year==todayYear&&month>todayMonth)) {//생년월일을 미래의 값으로 입력하는 경우
				throw new Exception("현재 날짜 이전을 입력하세요.");
			}
			if (month < 1 || month > 12) {//월을 1~12로 입력하지 않은 경우
				throw new Exception("01~12월 사이를 입력하세요.");
			}
			if (year < 1900) {//연도가 1900 미만인 경우
				throw new Exception("1900년 이전은 표시되지 않습니다.");
			}
			int koreanAge = todayYear - year + 1;
			int internationalAge = ((todayYear*12+todayMonth)-(year*12+month))/12;
			// 결과 출력
			System.out.println("한국나이: " + koreanAge + "세");
			System.out.println("만 나이: " + internationalAge + "세");
		}
		catch(Exception e) {
			if(e.getMessage()==null) {
				System.err.println("문제 발생");
			}
			else {
				System.err.println("예외 발생 : "+e.getMessage());
			}
		}
	}
}
