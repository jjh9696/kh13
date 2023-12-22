package oop.multi2;

public class Test02 {

	public static void main(String[] args) {
//	 랜덤으로 비행물체 1개를 만들어서 날려보세요
		
		int choice=1;
		
		Flyable fly;

		if (choice==1) {
			fly= new Drone();//업캐스팅
		}
		else {
			fly=new Airplane();//업캐스팅
		}

		fly.fly();
		
		
	}

}
