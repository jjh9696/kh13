package oop.inherit6;

public class Mp4 extends MusicFile {
	private double speed;
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		if(speed<=0) return;
		this.speed = speed;
	}
	
	protected Mp4(String filename, long filesize, double speed) {
		super(filename, filesize);
		this.speed=speed;
	}
	public void information () {
		System.out.println("파일명 : "+getFilename());
		System.out.println("파일크기 : "+getFilesize()+"BYTE");
		System.out.println("재생속도 : "+speed);
		System.out.println("<기능>");
	}

}
