package loop3;

public class Test03다이어트풀이비추천 {

	public static void main(String[] args) {
		/*
		오늘부터 다이어트를 위해 줄넘기를 하려고 합니다.
		첫날은 힘드니까 100개만 하고 다음날부터는 전날보다 10개씩 더 하려고 합니다.

		1. 30일동안 하게되는 일자별 줄넘기 개수 출력
		2. 30일동안 하게되는 총 줄넘기 개수 출력
		*/
		int bigin = 100;
		int step = 10;
		
		//너무 어려운 계산
		for(int day=1;day<=30;day++) {
			int count = day *10 +bigin-step;
			System.out.println(day+"일차 줄넘기 "+count+"개 했습니다.");
		}
		//나머지는 내가 푼거랑 동일해서 생략
	}

}
