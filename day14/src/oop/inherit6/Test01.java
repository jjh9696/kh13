package oop.inherit6;

public class Test01 {

	public static void main(String[] args) {

		Mp3 f1 = new Mp3("노래.mp3", 75151, 500);
		Mp4 f2 = new Mp4("영상.mp4",143154,1);
		Hwp f3 = new Hwp("한글.hwp",2674,7);
		Ppt f4 = new Ppt("파워포인트.ppt",56548,20);
		
		f1.information();
		f1.execute();
		f1.forward();
		f1.rewind();
		System.out.println();
		f2.information();
		f2.execute();
		f2.forward();
		f2.rewind();
		System.out.println();
		f3.information();
		f3.execute();
		f3.preview();
		System.out.println();
		f4.information();
		f4.execute();
		f4.slideShow();
		
	}

}
