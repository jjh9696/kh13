package data;

public class Test02분식집 {

	public static void main (String[] args) {
		
	// Q) 떡볶이가 1인분에 3500원, 튀김이 1인분에 2000원일 때 떡볶이 4인분과 튀김 2인분을 주문하면 얼마인가요?
		
	//1. 내가 다 계산하고 결과만 출력
		//System.out.println(18000);
		
	//2. 컴퓨터에게 식으로 계산을 시켜 결과를 출력
		//System.out.println(14000 + 4000);
		//System.out.println((3500*4)+(2000*2));
		
	//3.각각의 합계와 총 금액을 출력
	/*	System.out.println(3500*4);
		System.out.println(2000*2);
		System.out.println((3500*4)+(2000*2)+"원 입니다."); */
		
	//4. 계산식의 결과를 "변수"에 저장한 뒤 출력
	/*	int a = 3500 * 4;
		int b = 2000 * 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);	*/
		
	//5. 모든 수치를 변수로 관리하여 계산 및 출력(최종)
		int ddeokboki = 3500; 
		int fried = 2000;
		int ddeokbokiCount = 4;
		int friedCount = 2;
		
		int ddeokbokiTotal = ddeokboki * ddeokbokiCount;
		int friedTotal =	fried * friedCount;
		int total = ddeokbokiTotal + friedTotal;
		
		System.out.println(ddeokbokiTotal);
		System.out.println(friedTotal);
		System.out.println(total);
				
	}
}
