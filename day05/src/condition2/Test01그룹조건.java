package condition2;

public class Test01그룹조건 {

	public static void main(String[] args) {

			
		int minute = 140;
		
		boolean bus = minute >= 120;
		
		if(bus) {//버스를 탈 수 있는 경우
			System.out.println("버스를 타고 학원에 갑니다");
		}
		else {//버스를 못 타는 경우 -지하철, 택시, 죄송...
			boolean subway = minute >= 60;
			if(subway) {//지하철을 탈 수 있는 경우
				System.out.println("지하철을 타고 학원에 갑니다");
			}
			else {//지하철을 못 타는 경우 -택시, 죄송...
				boolean taxi = minute >= 30;
				if(taxi) {//택시를 탈 수 있는 경우
					System.out.println("택시를 타고 학원에 갑니다");
				}
				else {//택시를 못타는 경우
					System.out.println("강사에게 전화를 합니다");
				}
			}		
		}	
	}
}

