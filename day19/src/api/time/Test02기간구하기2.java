package api.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test02기간구하기2 {

	public static void main(String[] args) {
		/*
		api.time.Test02기간구하기
		사용자에게 YYYY-MM-DD 형태로 두 개의 날짜를 입력받아서 두 날짜의 차이를 구하여 화면에 출력

		요구사항
		반드시 먼저 입력한 날짜가 나중에 입력한 날짜보다 이전이어야 합니다
		그렇지 않을 경우 차이를 계산할 수 없습니다 메세지를 출력
		차이는 ?년 ?개월 ?일 형태로 출력해주세요
		*/
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("첫 번째 날짜를 입력하세요 (YYYY-MM-DD): ");
	        String dateStr1 = scanner.nextLine();
	        System.out.print("두 번째 날짜를 입력하세요 (YYYY-MM-DD): ");
	        String dateStr2 = scanner.nextLine();

	        // 날짜를 LocalDate로 변환합니다.
	        LocalDate date1 = LocalDate.parse(dateStr1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        LocalDate date2 = LocalDate.parse(dateStr2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

	        // 입력된 날짜의 순서를 확인하고 차이를 계산합니다.
	        if (date1.isBefore(date2)) {
	            Period period = Period.between(date1, date2);

	            // 차이를 출력합니다.
	            System.out.printf("차이: %d년 %d개월 %d일%n", period.getYears(), period.getMonths(), period.getDays());
	        } else {
	            System.out.println("첫 번째 날짜가 두 번째 날짜보다 이후입니다. 차이를 계산할 수 없습니다.");
	        }
	}

}
