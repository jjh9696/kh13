package condition2;

import java.util.Scanner;

public class Test04체질량계산기풀이 {

	public static void main(String[] args) {

	/*	과거에 만들었던 BMI 계산기에 다음 기준에 따라 판정 구문을 추가해보세요
	 * 	
	 * 	18.5 미만 - 저체중
	 * 	18.5 이상 23미만 - 정상
	 * 	23 이상 25 미만 - 과체중
	 * 	25이상 30미만 - 경도비만
	 * 	30이상 - 중등도비만
	 * 
	 * 	BMI = 체중(kg)/키(m²)
	 */
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("체중(kg)을 입력하세요 : ");
		float kg = sc.nextFloat();
		System.out.print("키(m²)를 입력하세요 : ");
		float cm = sc.nextFloat();
		
		//계산
		float m = cm/100;
		float bmi  = kg / (m*m);
		
		String status;
		
	//	boolean underWeight = bmi < 18.5;
	//	boolean normalWeight = bmi >= 18.5 && bmi < 23;
	//	boolean overWeight = bmi >= 23 && bmi < 25;
	//	boolean mildObesity = bmi >= 25 && bmi < 30;
	//	boolean moderateObesity = bmi >= 30;
		
		if (bmi < 18.5f) {
			status="저체중";
		}
		else if (bmi < 23f) {
			status="정상";
		}
		else if (bmi < 25f) {
			status="과체중";
		}
		else if (bmi < 30f) {
			status="경도비만";
		}
		else {
			status="중등도비만";
		}
		System.out.println("귀하의 BMI 지수는 "+ bmi +" 입니다.");
		System.out.println("당신의 상태 = "+ status +" 입니다.");
		
	}

}
