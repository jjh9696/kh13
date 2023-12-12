package loop2;

import java.util.Scanner;

public class Test03등급판정 {

	public static void main(String[] args) {
		/*
		사용자에게 10개의 시험점수를 입력받아서 A등급과 B등급의 개수를 출력

		A등급은 85점 이상 100점 이하
		B등급은 70점 이상 85점 미만
		*/
		Scanner sc = new Scanner(System.in);
		
		int countA=0;
		int countB=0;
		System.out.println("10명의 점수를 입력하세요");
				
		for(int i=1;i<=10;i++) {
			int score = sc.nextInt();
			
			if (score>=85 && score<=100) {
				countA++;
			}
			else if (score>=70 && score<85) {
				countB++;
			}
		}
		System.out.println("A "+countA+"명, "+"B "+countB+"명");
	}
}
