package oop.total1;

public class Time {

	private int hour;
	private int min;
	private int sec;
	
	public int getSec() {
		return sec;
	}
	
	public void setSec(int sec) {
		if(sec>=60) {
			
			min=min+sec/60;
			sec=sec%60;
		}
		this.sec = sec;
	}
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) {
		if(min>=60) {
			hour=hour+min/60;
			min=min%60;
		}
		this.min = min;
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}



	public Time(int hour,int min,int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}
	public Time(int min,int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}
	public Time(int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}
	
	
	void show () {
		System.out.println(this.getHour()+"시간 "+this.getMin()+"분 "+this.getSec()+"초");
	}
	
}
