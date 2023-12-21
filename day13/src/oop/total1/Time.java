package oop.total1;

public class Time {

	private long totalTime;
	
	public long getTotalTime() {
		return totalTime;
	}
	
	public void setTotalTime(long totalTime) {
		
	}
	public Time(long hour,long min,long sec) {
		long total = hour*60*60+min*60+sec;
		this.setTotalTime(total);
	}
	public Time(long min,long sec) {
		long total = +min*60+sec;
		this.setTotalTime(total);
	}
	public Time(long sec) {
		long total = sec;
		this.setTotalTime(total);
	}
	
	public long getHour() {
		return this.totalTime/60/60;
	}
	public long getMin() {
		return this.totalTime/60%60;
	}
	public long getSec() {
		return this.totalTime%60;
	}
	
	
	void show () {
		System.out.println(this.getHour()+"시간 "+this.getMin()+"분 "+this.getSec()+"초");
	}






	
}
