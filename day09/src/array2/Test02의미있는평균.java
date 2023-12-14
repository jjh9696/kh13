package array2;

import java.util.Scanner;

public class Test02의미있는평균 {

	public static void main(String[] args) {
		/*
		사용자에게 5개의 실수를 입력받아 평균을 구하려고 합니다. 

		좀 더 의미있는 데이터를 만들기 위해서 가장 작은 값과 가장 큰 값을 
		뺀 나머지 데이터로 평균을 구하는 프로그램을 구현하세요.
		*/
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];
		int max = 0;
		int min = 0;
		double total = 0;
		System.out.println("숫자 5개 입력");
		for (int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextDouble();
		}
		
		for(int i=0;i<numbers.length;i++) {
			if (numbers[max]<numbers[i]) {
				max=i;
			}
			if (numbers[min]>numbers[i]) {
				min=i;
			}
			total+=numbers[i];
		}
		
		System.out.println("총 합 : "+ (total-numbers[max]-numbers[min]));
		System.out.println("평균 : "+(total-numbers[max]-numbers[min])/(numbers.length-2));
	}

}
