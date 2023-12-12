package loop3;

public class Test03다이어트 {

	public static void main(String[] args) {
		/*
		오늘부터 다이어트를 위해 줄넘기를 하려고 합니다.
		첫날은 힘드니까 100개만 하고 다음날부터는 전날보다 10개씩 더 하려고 합니다.

		1. 30일동안 하게되는 일자별 줄넘기 개수 출력
		2. 30일동안 하게되는 총 줄넘기 개수 출력
		*/
		int jump = 100;
		int all = 0;
		
		for(int i=1;i<=30;i++) {
			System.out.println("오늘은 줄넘기 "+jump+"개 했습니다.");
			all += jump;
			jump += 10;
		}
		System.out.println("줄넘기 총 "+all+"개 했습니다.");
	}

}
