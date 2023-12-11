package loop;

public class Test05필터링합 {

	public static void main(String[] args) {
		/*
		다음 숫자를 화면에 출력해보세요
		1부터 20 사이의 홀수
		1부터 50 사이의 3의배수
		*/
		int sum = 0;
		for (int i=1;i<=20;i++) {
			if(i%2==1) {
				sum +=i;
			}
		}
		System.out.println(sum);
		sum = 0;
		for (int i=1;i<=50;i++) {
			if(i%3==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}
