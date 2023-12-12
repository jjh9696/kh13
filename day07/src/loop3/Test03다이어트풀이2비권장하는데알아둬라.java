package loop3;

public class Test03다이어트풀이2비권장하는데알아둬라 {

	public static void main(String[] args) {
		/*
		오늘부터 다이어트를 위해 줄넘기를 하려고 합니다.
		첫날은 힘드니까 100개만 하고 다음날부터는 전날보다 10개씩 더 하려고 합니다.

		1. 30일동안 하게되는 일자별 줄넘기 개수 출력
		2. 30일동안 하게되는 총 줄넘기 개수 출력
		*/
		int step = 10;
		int total = 0;
		
		//(참고) 반복 변수는 한개가 아니어도 된다
		for(int i=1, count = 100;i<=30;i++, count += step) {
			System.out.println("오늘은 줄넘기 "+count+"개 했습니다.");
			total += count;
		}
		System.out.println("줄넘기 총 "+total+"개 했습니다.");
	}

}
