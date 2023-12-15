package array4;

public class Test03이차원배열초기화2 {

	public static void main(String[] args) {

		//배열생성
		int dataset[][] = new int[5/*줄*/][5/*칸*/];
		
		//데이터 초기화
//		-값 기준
		
		int x=0 ,y=0 ;
		for(int i=1;i<=25;i++) {
			dataset[x][y]=i;
			y++;
			if(y==5) {
				y=0;
				x++;
			}
		}
		
		//배열출력
		for(int i=0;i<dataset.length;i++) {
			for(int k=0; k<dataset.length;k++) {
				System.out.print(dataset[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
