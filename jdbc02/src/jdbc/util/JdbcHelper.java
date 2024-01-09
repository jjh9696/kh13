package jdbc.util;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcHelper {
	
	//JdbcTemplate을 생성하는 메소드 구현
	//=아무나 객체 없이 접근 가능하게 구현
	public static JdbcTemplate getJdbcTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("kh13");//아이디
        dataSource.setPassword("kh13");//비밀번호
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");//DB종류 지정
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//DB연결유형+위치
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        
        return jdbcTemplate;
    }
}
