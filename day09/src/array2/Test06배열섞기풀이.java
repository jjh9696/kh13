package array2;

import java.util.Random;

public class Test06배열섞기풀이 {

	public static void main(String[] args) {
		/*
		Test05와 동일한 데이터를 배열에 저장하고 다음 규칙에 따라 데이터를 섞어보세요

		실행할 때마다 다른 위치로 바뀌도록 섞고 싶음
		배열의 모든 자리가 1번은 반드시 바뀌어야함
		바뀌는 자리가 같은 자리여도 상관없음
		모든 자리가 교체된 후 배열을 출력
		*/
		
		//데이터 준비
		int numbers[]=new int[] {30,50,20,10,40};
		
		//맨 앞자리(+0지점)를 랜덤한 위치와 변경
		Random r = new Random();
		int index=r.nextInt(5);
		System.out.println("index = "+index);

		//교체(swap)
		int temp =numbers[0];
		numbers[0]=numbers[index];
		numbers[index]=temp;
			
		//출력
		for(int i =0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
}
