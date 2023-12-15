package array3;


public class Test01선택정렬 {

	public static void main(String[] args) {

		
		int[] numbers = new int[] {30,50,20,10,40};
		int min = 0;
		
		for(int i=0;i<numbers.length;i++) {
			if (numbers[min]>numbers[i]) {
				min=i;
			}
		}
//		for(int i=0;i<numbers.length;i++) {
			int temp =numbers[0];
			numbers[0]=numbers[min];
			numbers[min]=temp;
//		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
