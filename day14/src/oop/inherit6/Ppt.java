package oop.inherit6;

public class Ppt extends OfficeFile{

	protected Ppt(String filename, long filesize, int pagesize) {
		super(filename, filesize, pagesize);
	}
	
	public void slideShow () {
		System.out.println("슬라이드쇼");
	}

}
