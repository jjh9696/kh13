package data4;

public class Test04숫자판정 {

	public static void main(String[] args) {
		
	/*	
		어떤 두 자리 숫자가 주어졌을 때
		이 숫자에 7이 포함되어 있는지 검사하여 결과 출력

		int number = 71;

		위와 같은 상황이라면 true가 나와야 합니다
		참고로 자바에서 같다는 ==를 사용합니다
	*/	
		//입력
		int number = 71;
		
		int ten = number/10;
		int one = number%10;
		
		boolean check = ten==7 || one==7;
		
		System.out.println("7이 들어있나요? "+check);
		
	}

}
