package data4;

public class Test03논리연산 {

	public static void main(String[] args) {
		
	/*	논리연산
	 	-논리끼리 계산할 때 사용
	 	-&&(and), ||(or) 을 이용하여 조합
	 	
	 	ex) 19살은 청소년인가요?
	 	- 청소년은 14살부터 19살까지 입니다
	 */	
		
		int age = 19;
		boolean teen = 14 <= age && age <= 19;
		System.out.println(teen);
	}

}
