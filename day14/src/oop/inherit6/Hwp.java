package oop.inherit6;

public class Hwp extends OfficeFile{

	protected Hwp(String filename, long filesize, int pagesize) {
		super(filename, filesize, pagesize);
	}

	public void preview () {
		System.out.println("미리보기");
	}
}
