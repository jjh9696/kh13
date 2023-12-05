package data;

public class Test05편의점풀이 {

	public static void main(String[] args) {
	/*	편의점에서 삼각김밥을 1+1으로 판매중입니다
	 	아르바이트생은 여러분 생각만큼 친절하지 않아서
	 	5개를 가져간다 한들 한 개 더 가져오면 공짜라는 말을 안합니다
	 	
	 	삼각김밥 한 개가 1200원 이라고 할 때,
	 	삼각김밥 7개를 사면 
	 	1. 몇 개가 공짜 처리되는지
	 	2. 다 해서 얼마인지
	 	구해서 출력해보세요
	 */

		//입력 - 김밥개수, 가격
		int kimbob = 7;
		int price = 1200;
		
		//계산 - 무료든 유료든 한 쪽 개수
		int freeKimbob = kimbob /2;
		//System.out.println(freeKimbob);
		int buyKimbob = kimbob - freeKimbob;
		//System.out.println(buyKimbob);
		
		int paidPrice = buyKimbob * price;
		
		System.out.println("1. 공짜 김밥은 "+freeKimbob+"개 입니다.");
		System.out.println("2. 전체 비용은 "+paidPrice+"원 입니다.");
				
	}	

}
