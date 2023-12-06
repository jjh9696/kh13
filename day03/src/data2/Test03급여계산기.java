package data2;

public class Test03급여계산기 {

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
		
		int salary = 3000000;	//급여액
		double pension = salary * 4.5 / 100;	//국민연금
		double healthInsurance = salary* 7.09 / 100;	//건강보험료
		double nursingInsurance = healthInsurance * 12.81 / 100;	//장기요양보험료
		double employmentInsurance = salary * 0.9 / 100;	//고용보험료
		double realSalary = salary - pension - healthInsurance - nursingInsurance - employmentInsurance;
		//실수령액
		
		System.out.println("급여액은 "+ salary + "원, " + "실수령액은 " + realSalary + "원 입니다.");
		System.out.println("국민연금은 " + pension + "원 입니다.");
		System.out.println("건강보험료는 " + healthInsurance + "원 입니다.");
		System.out.println("장기요양보험료는 " + nursingInsurance + "원 입니다.");
		System.out.println("고용보험료는 " + employmentInsurance + "원 입니다.");
				
				
	}

}
