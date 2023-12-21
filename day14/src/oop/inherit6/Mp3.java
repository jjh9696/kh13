package oop.inherit6;

public class Mp3 extends MusicFile{
	private int duration;
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		if(duration<0) return;
		this.duration = duration;
	}
	protected Mp3(String filename, long filesize, int duration) {
		super(filename, filesize);
		this.duration=duration;
	}
	public void information () {
		System.out.println("파일명 : "+getFilename());
		System.out.println("파일크기 : "+getFilesize()+"BYTE");
		System.out.println("재생 시간 : "+duration/60/60+"시간, "+duration/60%60+"분, "+duration%60+"초");
		System.out.println("<기능>");
	}

}
