package array2;

import java.util.Random;

public class Test03로또번호카운트2 {
	public static void main(String[] args) {
		
		//로또가 아니라 주사위를 10번 던진다고 가정
		//- 주사위 내역은 저장의 대상이 아님
		
		Random r = new Random();
		
		int[] counts = new int[45];
		
		for(int i=0; i < 1000; i++) {
			int number = r.nextInt(45) + 1;
			counts[number-1]++;
		}
		
		//최대값의 위치(index)를 찾자!
		int max = 0;//맨앞이 가장 크다고 치자
		for(int i=1; i < counts.length; i++) {//그다음부터 마지막까지 조회하며
			if(counts[max] < counts[i]) {//내가아는 최대값보다 더큰게 나타난다면
				max = i;
			}
		}
		
		//1
		for(int i=0; i < counts.length; i++) {
			System.out.println((i+1) + "  나온 횟수 = " + counts[i]);
		}
		
		//2 - 동점까지 출력하고 싶다면
		for(int i=0; i < counts.length; i++) {
			//if(가장 많이나온횟수랑 같은 칸이 있다면) {
			if(counts[max] == counts[i]) {
				System.out.println("가장 많이 나온 수 " + (i + 1) + "("+counts[i]+"번)");
			}
		}
		
	}
}