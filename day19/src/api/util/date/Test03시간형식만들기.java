package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test03시간형식만들기 {

	public static void main(String[] args) {
		/*
		Test03시간형식만들기
		Date, SimpleDateFormat 클래스를 사용하여 다음 형태의 시간을 만들어 출력해보세요

		2023년 7월 11일
		오후 1시 5분
		13:05:30
		2023-07-11 화 13:05:30
		*/
		
		Date a = new Date();
		SimpleDateFormat fmtA = new SimpleDateFormat("y년 M월 d일");
		System.out.println(fmtA.format(a));
		
		SimpleDateFormat fmtB = new SimpleDateFormat("a h시 m분");
		System.out.println(fmtB.format(a));
		
		SimpleDateFormat fmtC = new SimpleDateFormat("HH:mm:ss");
		System.out.println(fmtC.format(a));
		
		SimpleDateFormat fmtD = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		System.out.println(fmtD.format(a));
	}

}
