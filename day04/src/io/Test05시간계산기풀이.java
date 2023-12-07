package io;

import java.util.Scanner;

public class Test05시간계산기풀이 {

	public static void main(String[] args) {

		
	/*	사용자에게 강의장 입실시각과 퇴실시각을 4자리 정수로 입력받아 수업에 참여한 시간을 계산하여 출력하는 프로그램을 구현

		입실시각 입력 : 0925
		퇴실시각 입력 : 1827

		수업에 참여한 시간은 총 9시간 2분입니다.
		

	*/
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입실시간 입력 : ");
		int in = sc.nextInt();
		System.out.print("퇴실시간 입력 : ");
		int out = sc.nextInt();
		
		//계산
		int inHour = in/100; 
		int outHour = out/100;
		int inMin = in%100;
		int outMin = out%100;
		
		int inTime = inHour*60+inMin; 
		int outTime = outHour*60+outMin; 
		
		int time = outTime-inTime;
		int	hour = time/60;
		int min = time%60;
		
		//출력
		System.out.println("수업에 참여한 시간은 " + hour+ "시간 "+min+"분 입니다.");
		
	}

}
