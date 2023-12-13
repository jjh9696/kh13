package array;

public class Test03배열생성 {

	public static void main(String[] args) {
		/*
		다음 정보를 저장할 수 있도록 배열을 만들고 데이터를 출력하세요

		[1] 30, 50, 20, 10, 40
		[2] 피카츄, 라이츄, 파이리, 꼬부기
		[3] 177.1f, 182.3f, 160.5f, 157.9f, 180.1f, 163.6f
		*/
		
		int[] arr1 = new int[] {30, 50, 20, 10, 40}; // a->[30][50][20][10][40]
		String[] arr2 = new String[] {"피카츄", "라이츄", "파이리", "꼬부기"};
		float[] arr3 = new float[] {177.1f, 182.3f, 160.5f, 157.9f, 180.1f, 163.6f};

		System.out.print("[1] ");
		for(int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("[2] ");
		for(int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.print("[3] ");
		for(int i=0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}
}