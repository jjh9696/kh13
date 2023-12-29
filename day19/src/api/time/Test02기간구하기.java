package api.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test02기간구하기 {

	public static void main(String[] args) {
		/*
		api.time.Test02기간구하기
		사용자에게 YYYY-MM-DD 형태로 두 개의 날짜를 입력받아서 두 날짜의 차이를 구하여 화면에 출력

		요구사항
		반드시 먼저 입력한 날짜가 나중에 입력한 날짜보다 이전이어야 합니다
		그렇지 않을 경우 차이를 계산할 수 없습니다 메세지를 출력
		차이는 ?년 ?개월 ?일 형태로 출력해주세요
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 날짜를 입력하세요 (YYYY-MM-DD): ");
		String input1 = sc.nextLine();
		System.out.print("두 번째 날짜를 입력하세요 (YYYY-MM-DD): ");
		String input2 = sc.nextLine();
		
		LocalDate date1 = LocalDate.parse(input1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date2 = LocalDate.parse(input2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		if (date1.isBefore(date2)) {
			Period period = Period.between(date1, date2);
			System.out.println(period.getYears()+"년 "+period.getMonths()+"개월 "+period.getDays()+"일 차이");
        } 
		else {
            System.out.println("첫 번째 날짜가 두 번째 날짜보다 이후입니다. 차이를 계산할 수 없습니다.");
        }
	}

}
