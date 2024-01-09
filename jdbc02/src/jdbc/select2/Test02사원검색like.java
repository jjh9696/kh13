package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpMapper;
import jdbc.select.EmpDto;
import jdbc.util.JdbcHelper;

public class Test02사원검색like {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("사원 이름 입력 : ");
		String keyword = sc.nextLine();
		sc.close();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where emp_name like ? || '%'";
		Object[] data = {keyword};
		EmpMapper mapper = new EmpMapper();

		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);

		//출력
		System.out.println("조회 결과 : " + list.size()+"개");
		for(EmpDto dto : list) {
			System.out.println(dto.getEmpName());
		}
	}

}
