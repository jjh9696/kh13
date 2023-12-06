package data2;

public class Test02비만계산기풀이 {

	public static void main(String[] args) {

	/*	BMI(체질량지수) 계산 공식은 다음과 같습니다.
	 	BMI = 체중(kg)/키(m²)
		키가 180cm, 몸무게가 80kg인 사람의 BMI 지수를 구하여 출력하세요
	*/	
	
		//입력
		double kg = 80;
		double cm = 180;
		
		//계산
		double m = cm/100;
		double bmi  = kg / (m*m);
		
		//입력
		System.out.println("귀하의 BMI 지수는 "+ bmi +" 입니다.");
	}

}
