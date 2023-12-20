package loop3;

import java.util.Scanner;

public class Test06모래성게임 {

	public static void main(String[] args) {
		/*
		남은 숫자 : 100
		가져갈 숫자(1~9) 입력 : 5

		남은 숫자 : 95
		가져갈 숫자(1~9) 입력 : 9
		
		남은 숫자 : 86
		가져갈 숫자(1~9) 입력 : ?
				
		...
				
		남은 숫자 : 1
		가져갈 숫자(1~9) 입력 : 1
				
		당신은 패배했습니다
		*/

		Scanner sc = new Scanner(System.in);
		int num = 100;
		
		while (num<=100) {
			System.out.println("현재 숫자 : "+num);
			System.out.print("1~9 사이의 숫자 입력 : ");
			int input = sc.nextInt();
			
			if(!(input>=1&&input<=9 )) {
				continue;
			}
			for (int i=1; i<=input; i++) {
				System.out.print(num-i+" ");
			}
			System.out.println();
			num-=input;
			if (num<=0) {
				System.out.println("탈락!");
				break;
			}
		}
	}

}
