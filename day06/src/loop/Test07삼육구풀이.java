package loop;

public class Test07삼육구풀이 {

	public static void main(String[] args) {
		
	
		for (int i=1; i<=99; i++) {
			int ten = i/10;
			int one = i%10;
			
			boolean has3 = ten == 3 || one ==3;
			boolean has6 = ten == 6 || one ==6;
			boolean has9 = ten == 9 || one ==9;
			boolean has369 = has3||has6||has9;
			
			
			if(has369) {
				System.out.println("박수");
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
