package api.time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.PrimitiveIterator.OfDouble;

public class Test04LocalDateTime클래스 {

	public static void main(String[] args) {

		//LocalDateTime클래스
		//-날짜와 시간을 모두 사용할 경우 필요한 클래스
		
		LocalDateTime a = LocalDateTime.now();//현재시각
		LocalDateTime b = LocalDateTime.of(2024, 1,2,9,30);//새해 첫 수업 시간
		
		
		//형식변경
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y년 M월 d일 H시 m분 s초");
		
		
		System.out.println("a = "+a.format(fmt));
		System.out.println("b = "+b.format(fmt));
		
		//비교
		System.out.println(a.isBefore(b));
		
		//간격구하기 - Duration
		Duration duration = Duration.between(a, b);
		System.out.println("duration = "+duration);
		System.out.println(duration.getSeconds());
		
		//지금부터 5시간 후를 객체로 구하여 출력
		//지금부터 3일 전을 객체로 구하여 출력
		
		LocalDateTime c = LocalDateTime.now().plusHours(5);
		System.out.println(c);
		LocalDateTime d = LocalDateTime.now().minusDays(3);
		System.out.println(d);
		
		}
}
