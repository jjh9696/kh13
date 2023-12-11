package loop;

public class Test06필터링풀이2비추천 {

	public static void main(String[] args) {
		
	//	1부터 99 사이의 숫자 중에서 5가 포함된 숫자들만 출력
	//	무식한 방법
	// 	5,15,25,35,45
	//	50,51,52,53,54,55,56,57,58,59
	//	65,75,85,95
		for (int i=5; i<=45; i+=10) {
			System.out.println(i);
			}
		for (int i=50; i<=59; i++) {
			System.out.println(i);
		}
		for (int i=65; i<=95; i+=10) {
			System.out.println(i);
			}
	}

}
