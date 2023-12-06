package data2;

public class Test03급여계산기풀이변환연산 {

	public static void main(String[] args) {

	/*	급여계산기	
	 	급여액이 주어졌을 때 각종 세금과 수령액을 계산하는 계산기를 구현합시다
	 	
	 	급여액 : 300만원
	 	국민연금 : 급여액의 4.5%
	 	건강보험료 : 급여액의 7.09%
	 	장기요양보험료 : 건강보험료의 12.81% 
	 	고용보험 : 급여액의 0.9%
	 	
	 	출력 순서 
	 	1. 실수령액
	 	2. 국민연금
	 	3. 건강보험료
	 	4. 장기요양보험료
	 	5. 고용보험료
	 */
		
		//입력
		int salary = 3000000;	//급여액
		
		//계산
		int pension = (int) (salary * 4.5 / 100);	//국민연금 == int pension = salary * 45 / 1000 이렇게 해도 됨
		int health = (int) (salary* 7.09 / 100);	//건강보험료
		int care = (int) (health * 12.81 / 100); //장기요양보험료
		int emp = (int) (salary * 0.9 / 100); //고용보험료
		int actual = salary - pension - health - care - emp; //실수령액
		
		//출력
		System.out.println("급여액은 "+salary+"원, " + "실수령액은 " + actual + "원 입니다.");
		System.out.println("국민연금은 " + pension + "원 입니다.");
		System.out.println("건강보험료는 " + health + "원 입니다.");
		System.out.println("장기요양보험료는 " + care + "원 입니다.");
		System.out.println("고용보험료는 " + emp + "원 입니다.");
				
				
	}

}
