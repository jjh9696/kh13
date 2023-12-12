package loop3;

public class Test02누적합계2 {

	public static void main(String[] args) {
		/*
		다음 누적합계를 구하세요

		1부터 100 사이의 짝수 합계를 구하여 출력
		1부터 100 사이의 7의 배수의 합계를 구하여 출력
		*/
		int sum1=0;
		int sum2=0;
		
		for (int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1 +=i;
			}
			if(i%7==0) {
				sum2 +=i;
			}
		}
		System.out.println("1부터 100 사이의 짝수 합계 : "+sum1);
		System.out.println("1부터 100 사이의 7의 배수의 합계 : "+sum2);
	}

}
