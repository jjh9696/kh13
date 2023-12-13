package loo3;

import java.util.Random;
import java.util.Scanner;

public class Test04업다운게임 {

	public static void main(String[] args) {
		/*
		업다운 게임은 랜덤으로 정해진 숫자를 맞추는 게임입니다.

		1.컴퓨터가 1부터 1000 사이의 정수 중 하나를 랜덤으로 정합니다.
		2.사용자는 컴퓨터가 만든 숫자를 알 수 없습니다.
		3.사용자가 입력을 통해 컴퓨터가 만든 숫자를 맞추려고 시도합니다.
		4.사용자의 입력이 정답이랑 같으면 프로그램은 종료됩니다.
		5.사용자의 입력이 정답이랑 다를 경우 다음과 같이 처리됩니다.
			1.입력이 정답보다 작을 경우 업이라고 알려줍니다.
			2.입력이 정답보다 클 경우 다운이라고 알려줍니다.

		정답을 맞추면 프로그램을 종료하면서 몇 번 시도하여 맞췄는지 알려주도록 프로그램을 구현하세요.
		*/
		
		Random r=new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		int randomNumber = r.nextInt(1000)+1;
		while(true) {
			count++;
			
			System.out.print("숫자를 입력하세요 : ");
			int input = sc.nextInt();
			if (randomNumber==input) {
				System.out.println("정답");
				break;
			}
			else if (randomNumber<input) {
				System.out.println("다운");
			}
			else {
				System.out.println("업");
			}
		}
		System.out.println("시도횟수 : "+count);
	}

}
