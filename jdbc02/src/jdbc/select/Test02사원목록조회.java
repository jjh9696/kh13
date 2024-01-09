package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원목록조회 {

	public static void main(String[] args) {
/*
		다음 보조 클래스들을 만드시고 사원 목록을 조회하세요
		필요하다면 사원 더미데이터를 생성한 뒤 진행하세요
		(ChatGPT 시키면 잘 만들어줍니다)

		EmpDto : 데이터 변환 객체
		EmpMapper : ResultSet 변환 클래스
*/
		String sql="select * from emp";
		
		JdbcTemplate jdbcTemplate  = JdbcHelper.getJdbcTemplate();
		EmpMapper mapper = new EmpMapper();
		
		List<EmpDto> list = jdbcTemplate.query(sql, mapper);
		System.out.println("조회 결과 수 : "+list.size());
		
		
		 for (EmpDto empDto : list) {
			 System.out.println(empDto.getEmpNo() + " | " + empDto.getEmpName() + " | " + empDto.getEmpDept() + " | "
					 + empDto.getEmpDate() + " | " + empDto.getEmpSal());
		 }
		
	}

}
