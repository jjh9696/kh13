package array2;

import java.util.Random;

public class Test03로또번호카운트 {

	public static void main(String[] args) {
		/*
		KH로또연구소에서는 가장 많이 나오는 로또번호가 몇번인지 알고 싶어서 시뮬레이션을 진행하려고 합니다.

		로또번호를 1000번정도 추첨해서 각각 나온 횟수를 저장하려고 합니다.

		번호별로 나온 횟수를 출력
		가장 많이 나온 번호를 출력(동점이면 아무거나)		
		*/
		Random r = new Random();
		int lotto[] = new int[45]; 		//로또배열
		int lottoCount[] = new int[45];	//개수배열
		int max = 0;
		
		for (int i=0; i<lotto.length;i++) {
			lotto[i]=i+1;  				//로또번호생성
		}
		for(int i=1;i<=1000;i++) {
			int num = r.nextInt(45);	//랜덤번호뽑기
			lottoCount[num]++;			//번호가 나오면 개수배열에 +1
		}
		for(int i=0;i<lottoCount.length;i++) {
			System.out.println(lotto[i]+"="+lottoCount[i]+"회"); //로또배열[i]=개수배열[i]회
			if (lottoCount[max]<lottoCount[i]) { 	//높은값=많이나온값
				max=i;								
			}
		}
		System.out.println("가장 많이 나온 숫자 "+(max+1));
		System.out.println(lottoCount[max]+"회");
	}
}
