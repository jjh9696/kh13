package data4;

import java.time.LocalDate;

public class Test06건강검진풀이 {

	public static void main(String[] args) {
	/*	
		건강검진은 30세 이상인 사람들을 대상으로 2년에 한 번씩 진행합니다.

		올해가 짝수 해라면 짝수년도 출생자들이 대상
		올해가 홀수 해라면 홀수년도 출생자들이 대상

		어떤 사람의 출생년도(ex : 1985)를 입력값으로 두고 이 사람이 올해 건강검진 대상자인지 판정하여 출력
	 */
		
		
		//입력
		int birth = 1983;
		int current=2023;

		/*계산
		 * 1. 30세 이상인가?
		 * 2. 올해가 홀수, 출생년도도 홀수인가?
		 * 3. 올해가 짝수, 출생년도도 짝수인가?
		 * 1,2를 만족하거나, 1,3을 만족하면 건강검진 대상자
		 */
		int age = current-birth+1;
		boolean first = current-birth+1>=30;
		boolean second = birth%2==1 && current%2==1;
		boolean third = birth%2!=1 && current%2!=1;
		
		boolean result = (first && second) || (first && third);
		System.out.println("나이 = "+age+"세");
		System.out.println("30세 이상? = "+first);
		System.out.println("홀수대상자? "+second);
		System.out.println("짝수대상자? "+third);
		System.out.println(current+"년도 건강검진 대상자 = "+result);
		
	}

}
