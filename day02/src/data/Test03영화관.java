package data;

public class Test03영화관 {

	public static void main (String[] args) {
		
/*	영화관 요금표는 다음과 같습니다.
	성인 : 12000원
	청소년 : 8500원

	성인 2명과 청소년 2명의 요금을 구하세요 */
	
		int adult = 12000;
		int child = 8500;
		int adultCount = 2;
		int childCount = 2;
		
		int adultTotal = adult * adultCount;
		int childTotal = child * childCount;
		int total = adultTotal + childTotal;
		
		System.out.println("총 금액은 "+total+"원 입니다.");
		
	}
	
}
