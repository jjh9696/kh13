package array2;

import java.util.Random;

public class Test06배열섞기풀이4 {
	public static void main(String[] args) {

		//데이터 준비
		int[] numbers = new int[] {30, 50, 20, 10, 40};

		Random r = new Random();

		for(int i=0; i < numbers.length; i++) {
			//현재 위치와 같은 위치가 나오지 않도록 추가적인 재추첨을 하는 코드
			int index;
			while(true) {
				index = r.nextInt(numbers.length);
				if(i != index) break;
			}
			System.out.println("현재위치 : " + i + " , 바꿀위치 : " + index);

			//교체(swap) - [i]과 [index]를 교체
			int backup = numbers[i];
			numbers[i] = numbers[index];
			numbers[index] = backup;
		}

		//출력
		for(int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}