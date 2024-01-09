package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04Emp등록 {

	public static void main(String[] args) {
		/*
		다음 테이블과 시퀀스를 생성하고 사용자에게 등록에 필요한 정보를 입력받아 저장하도록 프로그래밍 하세요

		create table emp(
		emp_no number primary key,--사원번호, 시퀀스로 자동 부여
		emp_name varchar2(21) not null,--사원의 한글 이름
		emp_dept varchar2(30) not null,--사원의 소속 부서
		emp_date char(10) not null,--사원의 입사일
		emp_sal number default 0 not null check(emp_sal >= 0)--사원의 급여(원)
		);
		create sequence emp_seq;
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String emp_name = sc.nextLine();
		System.out.print("소속 부서 : ");
		String emp_dept = sc.nextLine();
		System.out.print("입사일 YYYY-MM-DD");
		String emp_date = sc.nextLine();
		System.out.print("급여 : ");
		int emp_sal = sc.nextInt();
		sc.nextLine();
		
		String sql = "insert into emp("
						+ "emp_no, emp_name, emp_dept,emp_date,emp_sal"
					+ ") "
					+ "values(emp_seq.nextval, ?, ?,?,?)";
		
		
		Object[] data = {emp_name, emp_dept,emp_date,emp_sal};

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
