package data;

public class Test07주차장풀이 {

	public static void main(String[] args) {

	/*	KH주차장은 10분당 1500원의 요금을 받고 있습니다.
		처음 9분까지는 돈을 받지 않고 10분이 되면 1500원, 20분이 되면 3000원으로 요금이 올라갑니다

		11시 50분에 들어와서 17시 25분에 나간 차량의 요금을 출력
		(단, 다음날까지 주차는 절대로 불가능합니다)
	*/	
		
		//입력
		int inHour = 11, inMinute = 50;
		int outHour = 17, outMinute = 25;
		
		int price = 1500;
		int parkingTime = 10;
		
		//계산
		int in = inHour*60+inMinute;
		int out = outHour*60+outMinute;
	//	System.out.println(in);
	//	System.out.println(out);
		int time = out - in;
	//	System.out.println(time);
		
		int hour = time/60;
		int minute = time%60;
		int parkingPrice = (time/parkingTime)*price;
		
		//출력
		System.out.println("총 주차 시간은 "+ hour +"시간"+ minute +"분, 요금은 "+ parkingPrice+"원 입니다.");
	}

}
