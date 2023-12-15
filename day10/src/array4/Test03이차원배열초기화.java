package array4;

public class Test03이차원배열초기화 {

	public static void main(String[] args) {

		//배열생성
		int dataset[][] = new int[5/*줄*/][5/*칸*/];
		
		//데이터 초기화
//		-위치 기준 or 값 기준

		int number=1;
		
		for(int i=0;i<dataset.length;i++) {
			for(int k=0; k<dataset.length;k++) {
				dataset[i][k]=number;
				number++;
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
