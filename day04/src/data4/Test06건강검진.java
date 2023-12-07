package data4;

import java.time.LocalDate;

public class Test06건강검진 {

	public static void main(String[] args) {
	/*	
		건강검진은 30세 이상인 사람들을 대상으로 2년에 한 번씩 진행합니다.

		올해가 짝수 해라면 짝수년도 출생자들이 대상
		올해가 홀수 해라면 홀수년도 출생자들이 대상

		어떤 사람의 출생년도(ex : 1985)를 입력값으로 두고 이 사람이 올해 건강검진 대상자인지 판정하여 출력
	 */
		
		int birth = 1985;
		
		LocalDate current = LocalDate.now();
		int year = current.getYear();
		
		boolean aCheck = year-birth+1>=30;
		
		boolean bCheck = birth%2==1;
		
		boolean yCheck = year%2==1;
		
		boolean check = aCheck && bCheck==yCheck;
		
		System.out.println(bCheck);
		System.out.println(yCheck);
		System.out.println(year+"년도 건강검진 대상자 = "+check);
		
	}

}
