package random;

import java.util.Random;

public class Test02랜덤생성 {

	public static void main(String[] args) {
		
//		1.로또번호 1개를 추첨한 결과
//		2.두자리 정수 중 한 개를 추첨한 결과
//		3.6자리 OTP 번호 한 개를 생성한 결과
//		4.동전의 앞/뒤 중 하나를 생성한 결과
//		5.가위/바위/보 중 하나를 생성한 결과
		
		Random r = new Random();
		int lotto = r.nextInt(45)+1;
		System.out.println("로또번호 : " +lotto);
		
		int num = r.nextInt(90)+10;
		System.out.println("두자리정수 : "+num);
		
		int otp = r.nextInt(900000)+100000;
		System.out.println("OTP번호 : "+otp);
		
		int coin = r.nextInt(2);
		if (coin==0) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
		
		int rcp = r.nextInt(3);
		if (rcp==0) {
			System.out.println("가위");
		}
		else if (rcp==1) {
			System.out.println("바위");
		}
		else {
			System.out.println("보");
		}
	}

}
