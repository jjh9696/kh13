package array4;

public class Test04지그재그 {

	public static void main(String[] args) {

		/*
		5x5 배열을 만들고 숫자를 다음과 같이 지그재그로 배치하고 출력하세요

		1    2    3    4    5
		10    9    8    7    6
		11    12    13    14    15
		20    19    18    17    16
		21    22    23    24    25
		*/
		
		int dataset[][] = new int[5][5];
		
		int number=1;
		
		for(int i=0;i<dataset.length;i++) {
			for(int k=0; k<dataset.length;k++) {
				dataset[i][k]=number;
				number++;
			}
		}
		
		for(int i=0;i<dataset.length;i++) {
				if(i%2==0) {
					for(int k=0; k<dataset.length;k++) {
						System.out.print(dataset[i][k]);
						System.out.print("\t");
					}
				}
				if(i%2==1) {
					for(int k=dataset.length-1; k>=0;k--) {
						System.out.print(dataset[i][k]);
						System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
