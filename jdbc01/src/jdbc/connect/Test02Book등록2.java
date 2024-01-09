package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02Book등록2 {

	public static void main(String[] args) {
		/*
		book  테이블에 다음과 같은 정보의 데이터를 등록할 수 있도록 구현하세요.

		book_id - 50
		book_title - 자바신공
		book_author - 열혈강사
		book_publication_date - 2023-10-01
		book_price - 5$
		book_publisher - 'wikidocs'
		book_page_count - 199
		book_genre - Education
		*/
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); //api 문서는 스프링에 가야 볼 수 있다
		dataSource.setUsername("kh13");//아이디
		dataSource.setPassword("kh13");//비밀번호(대소문자 구분)
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");//DB종류 지정
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//DB연결유형+위치
		
		String sql = "insert into book("
				+ "book_id,book_title,book_author,book_publication_date,book_price,book_publisher,book_page_count,book_genre"
				+ ")"
				+ "values("+input+")";
			
		//[3]명령 처리 도구 생성
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//[4]실행
		jdbcTemplate.update(sql);
		
		System.out.println("완료");
	}

}
