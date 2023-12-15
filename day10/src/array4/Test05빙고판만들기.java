package array4;

import java.util.Random;

public class Test05빙고판만들기 {

	public static void main(String[] args) {
		/*
		5x5 배열을 만들고 다음 규칙에 따라 빙고판을 만드세요

		1부터 25까지의 숫자를 순서대로 배열의 랜덤한 위치에 배치
		이미 숫자가 배치된 칸이 다시 추첨된 경우 재추첨하도록 처리
		재추첨은 현재 반복을 무효 처리하여 다시 반복하도록 만드는 것을 의미
		생성된 빙고판을 표 형태로 출력
		*/
		
		Random r = new Random();
		int dataset[][] = new int[5][5];

		for(int i=0;i<dataset.length;i++) {
			for(int k=0; k<dataset.length;k++) {
				int num;
			//	while(true) {
					num = r.nextInt(25)+1;
			//		if(dataset[i][k] == num) {
			//			break;
			//		}
			//	}
				dataset[i][k]=num;
			}
		}
		
		//배열출력
		for(int i=0;i<dataset.length;i++) {
			for(int k=0; k<dataset.length;k++) {
				System.out.print(dataset[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
