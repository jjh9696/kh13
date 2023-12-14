package array2;

public class Test05배열뒤집기2 {

	public static void main(String[] args) {
		
//		30, 50, 20, 10, 40을 배열에 저장하고 이 배열의 모든 데이터의 위치를 반대로 뒤집은 뒤 출력하세요
		
		int numbers[]=new int[] {30,50,20,10,40};
		int r[]=new int[numbers.length];
		
		
		for(int i=0 ;i<numbers.length;i++) {
			r[i] = numbers[numbers.length-1-i];
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(r[i]);
		}
	}
}
