package oop.modifier2;

public class Lecture {

	private String Course;
	private int time;
	private int price;
	private String classify;
	
	public void setCourse(String course) {
		this.Course = course;
	}
/*	public void setTime(int time) {
		if(time%30==0 && time>0) {
		this.time = time;
		}
	}*/
/*	public void setTime(int time) {
		if(time%30!=0 || time<=0) {
			return;
		}
		this.time = time;
	}*/
	public void setTime(int time) {//위의 두 방법도 가능
		if(time%30!=0) {
			return;
		}
		if(time<=0) {
			return;
		}
		this.time = time;
	}
/*	public void setPrice(int price) {
		if(price>=0) {
		this.price = price;
		}
	}*/
	public void setPrice(int price) {
		if(price<0) return;
			this.price = price;
	}
	
	//(주의) 	문자열과 객체 등은 비교연산을 쓰지 않는다
	//		(비교연산은 원시형을 위한 연산)
	//(해결)	별도의 비교명령을 쓰거나 switch구문을 사용
	public void setClassify(String classify) {
//		if (classify=="온라인"||classify=="오프라인"||classify=="혼합") {
//		this.classify = classify;
//		}
		switch(classify) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.classify = classify;
		}
	}
	public String getCourse() {
		return Course;
	}
	public int getTime() {
		return time;
	}
	public int getPrice() {
		return price;
	}
	public String getClassify() {
		return classify;
	}
	int getHourPrice() {
		return this.getPrice()/this.getTime()/10*10;
	}
	
	void data(String Course,int time,int price,String classify) {
		this.setCourse(Course);
		this.setTime(time);
		this.setPrice(price);
		this.setClassify(classify);
	}

	void information() {
		System.out.println("강좌명 : "+this.getCourse());
		System.out.println("강의시간 : "+this.getTime()+"시간");
		System.out.println("수강료 : "+this.getPrice()+"원");
		System.out.println("1시간당 수강료 : "+this.getHourPrice()+"원");
		System.out.println("구분 : "+this.getClassify());
		System.out.println();
	}
		
}
