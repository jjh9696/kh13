package array2;

public class Test04위치변경 {

	public static void main(String[] args) {

		//배열준비
		int[] numbers = new int[] {30,50,20,10,40};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		//[0]과 [3]의 데이터를 바꿔서 출력
		//자바는 데이터의 맞교환이 불가능(한칸에 하나밖에 안들어가니까)
//		numbers[0] = numbers[3];
//		numbers[3] = numbers[0];
		
		//변수를 하나 더 만들어서 백업할 수 있도록 구현
		int backup = numbers[0];
		numbers[0] = numbers[3];
		numbers[3] = backup;
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
