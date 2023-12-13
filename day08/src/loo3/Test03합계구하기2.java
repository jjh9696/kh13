package loo3;

import java.util.Scanner;

public class Test03합계구하기2 {

	public static void main(String[] args) {
//		사용자가 0을 입력하기 전까지 입력한 숫자들의 합계와 평균을 구하여 출력
		
		Scanner sc = new Scanner(System.in);
		int total=0;
		double average=0;
		double count=0;
		
		for(;;) {
			System.out.print("숫자를 입력하세요 (0 입력 시 종료): ");
			int input = sc.nextInt();
			
			if(input==0) {
				break;
			}
			count++;
			total+=input;
			average=total/count;
		}
		System.out.println("입력한 숫자의 합계 : "+total);
		System.out.println("입력한 숫자의 평균 : "+average);
	}

}
