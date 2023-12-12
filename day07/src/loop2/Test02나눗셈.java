package loop2;

import java.util.Scanner;

public class Test02나눗셈 {

	public static void main(String[] args) {
		
		/*
		어떤 숫자가 입력되었을 때 이 숫자의 약수 개수를 구하여 출력

		어떤 숫자가 입력되면 1부터 해당 숫자까지 나누어서 떨어지는 숫자의 개수를 구하여 출력
		예를 들어 5가 입력될 경우 5를 1, 2, 3, 4, 5로 나누어 떨어지는지 확인 (2개 / 1, 5)
		예를 들어 6이 입력될 경우 6을 1, 2, 3, 4, 5, 6으로 나누어 떨어지는지 확인(4개 / 1, 2, 3, 6)
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("약수 개수를 구할 숫자 입력 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<num;i++) {
			if (num%(num-i)==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(num + "은(는) 소수 입니다");
		}
		System.out.println(num+"의 약수는 "+count+"개 입니다");
	}
}
