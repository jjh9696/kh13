package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test03주말추첨풀이 {
	public static void main(String[] args) {
	
//	2024년의 주말(토,일) 중에서 무작위로 하루를 추첨해서 날짜 정보를 다음 형식으로 화면에 출력
//	2024년 6월 8일 토요일
	
	Random r = new Random();
	
	Calendar c = Calendar.getInstance();
	c.set(Calendar.YEAR, 2024);
	c.set(Calendar.MONTH, 0);

	while(true) {
		int day = r.nextInt(365);
		c.set(Calendar.DATE, 1+day);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		if(week == 1|| week == 7) break;
	}
    
    Date d = c.getTime();
	SimpleDateFormat fmt = new SimpleDateFormat("yyyy년 M월 d일 E요일");
	System.out.println(fmt.format(d));
	}
}
