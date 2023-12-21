package oop.inherit6;

public class MusicFile {
	//필드
	private String filename;
	private long filesize;
	
	
	//게터세터
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public long getFilesize() {
		return filesize;
	}
	public void setFilesize(long filesize) {
		if(filesize<0) return;
		this.filesize = filesize;
	}
	
	//생성자
	protected MusicFile(String filename,long filesize) {
		this.setFilename(filename);
		this.setFilesize(filesize);
	}
	
	//메소드
	public void execute () {
		System.out.println("실행");
	}
	public void forward () {
		System.out.println("빨리감기");
	}
	public void rewind () {
		System.out.println("되감기");
	}
	public void information () {
		System.out.println("파일명 : "+filename);
		System.out.println("파일크기 : "+filesize+"BYTE");
		System.out.println("<기능>");
	}
		
}
