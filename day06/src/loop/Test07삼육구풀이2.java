package loop;

public class Test07삼육구풀이2 {

	public static void main(String[] args) {
		
	
		for (int i=1; i<=99; i++) {
			int ten = i/10;
			int one = i%10;
			
			boolean ten369 = ten == 3 || ten == 6||ten == 9;
			boolean one369 =  one == 3 || one == 6|| one ==9;
			
			if(ten369 && one369) {
				System.out.println("짝짝");
			}
			else if (ten369 || one369) {
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
