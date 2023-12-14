package array;

import java.util.Random;

public class Test07확률뽑기 {

	public static void main(String[] args) {
		/*
		다음과 같은 아이템 추첨 확률이 주어졌을 때, 실행하면 확률에 맞게 무작위로 하나의 항목이 추첨되도록 구현

		금 상자 : 10%
		은 상자 : 20%
		철 상자 : 70%
		*/
		
		Random r = new Random();
		int num = r.nextInt(10);
		String[] box = new String[] {
			"금 상자","은 상자","은 상자","철 상자","철 상자",
			"철 상자","철 상자","철 상자","철 상자","철 상자"};
		System.out.println(box[num]);
		
		
		
	}

}
