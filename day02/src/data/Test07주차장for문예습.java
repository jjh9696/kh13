package data;

public class Test07주차장for문예습 {

	public static void main(String[] args) {

	/*	KH주차장은 10분당 1500원의 요금을 받고 있습니다.
		처음 9분까지는 돈을 받지 않고 10분이 되면 1500원, 20분이 되면 3000원으로 요금이 올라갑니다

		11시 50분에 들어와서 17시 25분에 나간 차량의 요금을 출력
		(단, 다음날까지 주차는 절대로 불가능합니다)
	*/	
		
		int inHour = 11;
		int inMinute = 50;
		int outHour = 17;
		int outMinute = 25;
		
		int price = 1500;
		
		int time = (outHour*60+outMinute) - (inHour*60+inMinute);
		
		int parkingPrice = (time/10)*price;
		
				
		for(int i=1; i<time/10; i++) {
			parkingPrice += price; 
				price	+= 1500;
			
		}
	//	System.out.println(
		
		System.out.println("총 주차 시간은 "+ time/60 +"시간"+time%60+"분, 요금은 " + parkingPrice+"원 입니다.");
	}

}
