package loop;

import java.util.Scanner;

public class Test09타이머1초멈추기추가 {

	public static void main(String[] args) {
		
/*		사용자에게 '분'과 '초'를 입력받아서 해당하는 시간만큼의 메세지를 출력하는 프로그램을 구현
		분 입력 : 1
		초 입력 : 30
		
		1분 30초 후 알람이 울립니다
		1분 29초 후 알람이 울립니다
		1분 28초 후 알람이 울립니다
		...
		0분 2초 후 알람이 울립니다
		0분 1초 후 알람이 울립니다
		0분 0초 후 알람이 울립니다
		띠링!
*/		
		Scanner a = new Scanner(System.in);
		System.out.print("분을 입력하세요 : ");
		int min = a.nextInt();
		System.out.print("초를 입력하세요 : ");
		int sec = a.nextInt();
		for (int time = min*60+sec;time>=0;time--) {
			System.out.println(time/60+"분 "+time%60+"초 후 알람");
				try {
					Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
		}
		System.out.println("띠링");
	}
}
