package oop.modifier3_;

public class Phone {

	String name;
	String telecom;
	int price;
	int agree;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTelecom(String telecom) {
		switch(telecom) {
		case "SK":
		case "KT":
		case "LG":
			this.telecom = telecom;
		}
	}
	public void setPrice(int price) {
		if (price>=0) {
		this.price = price;
		}
	}
	public void setAgree(int agree) {
//		if(agree==24||agree==36) {
			this.agree = agree;
//		}
//		else if(agree==0) {
//			System.out.println("설정하지 않음");
//			}
//		else return;
	}
	
	public String getName() {
		return name;
	}
	public String getTelecom() {
		return telecom;
	}
	public int getPrice() {
		return price;
	}
	public int getAgree() {
		return agree;
	}
	String getNoAgress() {
		return "설정하지 않음";
	}
	int getInstallment() {
		int money = 0;
		if (agree==24) {
			return money=price/24;
		}
		if (agree==36) {
			return money=price/36;
		}
		return money;
	}
	int getSaleA() {
		return (int) (((getPrice()*10000)-((getPrice()*10000)/100*0.5d))/10000);
	}
	int getSaleB() {
		return (int) (((getPrice()*10000)-((getPrice()*10000)/100*0.5d))%10000);
	}
	
	void data (String name,String telecom,int price,int agree){
		this.setName(name);
		this.setTelecom(telecom);
		this.setPrice(price);
		this.setAgree(agree);
	}
	
	void information() {
		System.out.println("이름 : "+this.getName());
		System.out.println("통신사 : "+this.getTelecom());
		if(agree==24||agree==36) {
//			this.agree = agree;
			System.out.println("가격 : "+this.getPrice()+"만원, 월할부금 : "+this.getInstallment()+"만원");
			System.out.println("약정개월 : "+this.getAgree());
		}
		else if(agree==0) {
			System.out.println("가격 : "+getSaleA()+"만"+getSaleB()+"원(약정없음)");
			System.out.println("설정하지 않음");
			}
		else {
			System.out.println("가격 : "+this.getPrice()+"만원");
		}
		System.out.println();
		
	}
}
