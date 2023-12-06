package data;

public class Test06복습시간풀이 {

	public static void main(String[] args) {

	/*	어제 복습한 시간은 총 2시간 45분이고
	 	오늘 복습한 시간은 총 3시간 55분 입니다.
		
		이틀동안 공부한 시간은 총 몇시간 몇분인가요?
		
		(Hint : 시간은 계산할 때 가장 작은 단위로 계산해야 편합니다)
	 */
		
		//입력
		int yesterdayHour = 2, yesterdayMin = 45;
		int	todayHour = 3, todayMin = 35;
		
		//계산
		int yesterdayTotal = yesterdayHour*60 + yesterdayMin;
		int todayTotal = todayHour*60 + todayMin;
		
		int total = yesterdayTotal+todayTotal;
		int Hour = total/60;
		int Min = total%60;
		
		//출력
		System.out.println("총 공부 시간은 "+Hour+"시간 "+Min+"분 입니다.");
	}

}
