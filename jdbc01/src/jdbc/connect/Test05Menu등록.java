package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05Menu등록 {

	public static void main(String[] args) {
		/*
		Test05Menu등록
		다음 테이블과 시퀀스를 생성하고 사용자에게 등록에 필요한 정보를 입력받아 저장하도록 프로그래밍 하세요

		create table menu(
		menu_no number primary key,--메뉴번호, 시퀀스로 자동 부여
		menu_name_kor varchar2(60) not null,--메뉴 한글 이름
		menu_name_eng varchar2(60) not null,--메뉴 영문 이름
		menu_type varchar2(30) not null,--메뉴 종류
		menu_price number default 0 not null check(menu_price >= 0)--메뉴 판매가(원)
		);
		create sequence menu_seq;
		
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 한글 이름 : ");
		String menu_name_kor = sc.nextLine();
		System.out.print("메뉴 영문 이름 : ");
		String menu_name_eng = sc.nextLine();
		System.out.print("메뉴 종류 : ");
		String menu_type = sc.nextLine();
		System.out.print("메뉴 판매가(원) : ");
		int menu_price = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		String sql = "insert into menu("
					+ "menu_no, menu_name_kor, menu_name_eng,menu_type,menu_price"
					+ ") "
					+ "values(menu_seq.nextval, ?,?,?,?)";
		
		
		Object[] data = {menu_name_kor, menu_name_eng,menu_type,menu_price};

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13");
		dataSource.setPassword("kh13");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, data);
		System.out.println("실행 완료");
	}

}
