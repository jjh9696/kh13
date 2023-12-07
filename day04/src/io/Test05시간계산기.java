package io;

import java.util.Scanner;

public class Test05시간계산기 {

	public static void main(String[] args) {

		
	/*	사용자에게 강의장 입실시각과 퇴실시각을 4자리 정수로 입력받아 수업에 참여한 시간을 계산하여 출력하는 프로그램을 구현

		입실시각 입력 : 0925
		퇴실시각 입력 : 1827

		수업에 참여한 시간은 총 9시간 2분입니다.
		

	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입실시간 입력 : ");
		int in = sc.nextInt();
		System.out.print("퇴실시간 입력 : ");
		int out = sc.nextInt();
		
		int hour = (out/100-in/100); 
		int min = (out%100-in%100);
		
		System.out.println("수업에 참여한 시간은 " + hour+ "시간 "+min+"분 입니다.");
		
	}

}
