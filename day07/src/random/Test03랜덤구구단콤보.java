package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단콤보 {

	public static void main(String[] args) {
		/*
		10개의 랜덤 구구단 문제를 출제하는 프로그램을 구현하세요
		2단 부터 19단 까지의 범위 내에서 출제
		사용자에게 입력을 받아 정답, 오답 판정
		사용자가 맞춘 문제 수를 카운트하여 출력
		맞춘 문제 하나당 점수를 부여
		쉬운 문제는 10점 (2~11단, x1)
		어려운 문제는 15점 (나머지)
		사용자가 획득한 점수를 누적합산하여 출력
		*/
		
		int answer;
		int combo=0;// 콤보도 결국 카운트, 정답을 맞추면 1증가, 틀리면 0
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
				
		for (int i=1; i<=10; i++) {
			int dan=r.nextInt(18)+2;
			int mul=r.nextInt(9)+1;
			
			System.out.print(dan+" x "+mul+" = ");
			answer = sc.nextInt();
				if(answer==dan*mul) {
					System.out.println("정답\n");
					combo++;
					if(combo>=2) {
						System.out.println("combo = "+combo);
					}
				}
				else {
					System.out.println("땡!\n");
					combo=0;
				}
		}
		System.out.println("게임 끝! "+combo+"개 연속 정답");
	}

}
