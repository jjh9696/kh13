package array3;


public class Test01선택정렬풀이3 {

	public static void main(String[] args) {

		
		int[] numbers = new int[] {30,50,20,10,40};
		
		//선택 정렬(selection sort)- 최소값을 앞에서부터 채우는 방식
		for(int k=0;k<=numbers.length-1;k++) {
			int min = k;
			for(int i=k+1;i<numbers.length;i++) {
				if (numbers[min]>numbers[i]) {
				min=i;
				}
			}
			int temp =numbers[k];
			numbers[k]=numbers[min];
			numbers[min]=temp;
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
