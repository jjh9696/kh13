package array;

import java.util.Random;

public class Test07확률뽑기2 {

	public static void main(String[] args) {
		/*
		다음과 같은 아이템 추첨 확률이 주어졌을 때, 실행하면 확률에 맞게 무작위로 하나의 항목이 추첨되도록 구현
		금 상자 : 10%
		은 상자 : 20%
		철 상자 : 70%
		*/

		Random r = new Random();
		String[] box = new String[] {"금 상자","은 상자","철 상자"};
		int num = r.nextInt(10)+1;
		if(num<=1) {
			System.out.println(box[0]);
		}
		else if (num<=3) {
			System.out.println(box[1]);
		}
		else {
			System.out.println(box[2]);
		}

	}
}