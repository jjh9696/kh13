package oop.method9;

public class Save {

	String name;
	double basic, prefer;
	int pay, year;
	
	void data(String name, double basic, double prefer,int pay,int year) {
		this.name=name;
		this.basic=basic;
		this.prefer=prefer;
		this.pay=pay;
		this.year=year;
	}	
	int getMonth() {
		return this.year*12;
	}
	int getTotal() {
		return this.pay*getMonth();
	}
	double getInterestRate() {
		return this.basic+this.prefer;
	}
	double getInterest() {
		return (getTotal()/100*getInterestRate());
	}
	int getYearPay() {
		return pay*12;
	}
	double getMaturity() {
		return getTotal() + this.getInterest();
	}
	boolean getTax() {
		return year<=3;
	}
	
	void information() {
		System.out.println("예금주 : "+this.name);
		System.out.println("기본이율 : "+this.basic+"%, 우대이율 : "+this.prefer+"%, 총 "+getInterestRate()+"%");
		System.out.println("예치기간 : "+this.year+"년");
		System.out.println("월 입금액 : "+this.pay+"원");
		System.out.println("연 입금액 : "+getYearPay()+"원");
		System.out.println("총 입금액 : "+getTotal()+"원");
		System.out.println("예상 이자 : "+(int)getInterest()+"원");
		System.out.println("만기 예상 금액 : "+(int)getMaturity()+"원");
		if (getTax()) {
			System.out.println("비과세 상품입니다.");
		}
		else {
			System.out.println("과세 상품입니다.");
		}
		System.out.println();
	
	}
}
