package array3;


public class Test01선택정렬2 {

	public static void main(String[] args) {

		
		int[] numbers = new int[] {30,50,20,10,40};
		int min = 0;
		
		for(int i=1,l=0;i<numbers.length;i++,l++) {
			
			min=l;
			for(int j=0;j<numbers.length;j++) {
				if (numbers[min]>numbers[j]) {
					min=j;
				}
			}
			for(int k=0;k<numbers.length;k++) {
				int temp =numbers[k];
				numbers[k]=numbers[min];
				numbers[min]=temp;
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
