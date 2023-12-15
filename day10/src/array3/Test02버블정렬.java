package array3;

public class Test02버블정렬 {

	public static void main(String[] args) {

		int[] numbers = new int[] { 30, 50, 20, 10, 40 };

		for (int k = 0; k < numbers.length - 1; k++) {
			for (int i = 0; i < numbers.length - 1 - k; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
