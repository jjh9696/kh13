package data2;

public class Test02비만계산기 {

	public static void main(String[] args) {

	/*	BMI(체질량지수) 계산 공식은 다음과 같습니다.
	 	BMI = 체중(kg)/키(m²)
		키가 180cm, 몸무게가 80kg인 사람의 BMI 지수를 구하여 출력하세요
	*/	
		int weight = 80;
		int height = 180;
		
		double heightSquare = height*height;
	//	System.out.println(heightSquare);
		double bmi = weight/heightSquare*10000; // (cm -> m)*2 
		
		System.out.println("귀하의 BMI 지수는 "+ bmi +" 입니다.");
	}

}
