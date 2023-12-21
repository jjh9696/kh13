package oop.inherit6;

public class OfficeFile {
	//필드
	private String filename;
	private long filesize;
	private int pagesize;
	
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
		this.filesize = filesize;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	//생성자
	protected OfficeFile(String filename,long filesize,int pagesize) {
		this.setFilename(filename);
		this.setFilesize(filesize);
		this.setPagesize(pagesize);
	}
	//메소드
	public void execute () {
		System.out.println("실행");
	}
	public void information () {
		System.out.println("파일명 : "+filename);
		System.out.println("파일크기 : "+filesize+"BYTE");
		System.out.println("페이지 수 : "+pagesize);
		System.out.println("<기능>");
	}
	
}
