package condition2;

import java.util.Scanner;

public class Test04체질량계산기 {

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
		Scanner sc = new Scanner(System.in);
		System.out.print("체중(kg)을 입력하세요 : ");
		double kg = sc.nextDouble();
		System.out.print("키(m²)를 입력하세요 : ");
		double cm = sc.nextDouble();
		
		double m = cm/100;
		double bmi  = kg / (m*m);
		
		boolean underWeight = bmi < 18.5;
		boolean normalWeight = bmi >= 18.5 && bmi < 23;
		boolean overWeight = bmi >= 23 && bmi < 25;
		boolean mildObesity = bmi >= 25 && bmi < 30;
	//	boolean moderateObesity = bmi >= 30;
		
		System.out.println("귀하의 BMI 지수는 "+ bmi +" 입니다.");
		
		if (underWeight) {
			System.out.println("저체중 입니다.");
		}
		else if (normalWeight) {
			System.out.println("정상체중 입니다.");
		}
		else if (normalWeight) {
			System.out.println("과체중 입니다.");
		}
		else if (normalWeight) {
			System.out.println("경도비만 입니다.");
		}
		else {
			System.out.println("중등도비만 입니다.");
		}
		
	}

}
