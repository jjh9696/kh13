package data;

public class Test06복습시간 {

	public static void main(String[] args) {

	/*	어제 복습한 시간은 총 2시간 45분이고
	 	오늘 복습한 시간은 총 3시간 55분 입니다.
		
		이틀동안 공부한 시간은 총 몇시간 몇분인가요?
		
		(Hint : 시간은 계산할 때 가장 작은 단위로 계산해야 편합니다)
	 */
		int yesterdayHour = 2;
		int yesterdayMin = 45;
		int	todayHour = 3;
		int todayMin = 35;
		
		int totalMin = (yesterdayHour+todayHour)*60+yesterdayMin+todayMin;
		
		int studyHour = totalMin/60;
		int studyMin = totalMin - studyHour*60;
		
		System.out.println("총 공부 시간은 "+studyHour+"시간 "+studyMin+"분 입니다.");
	}

}
