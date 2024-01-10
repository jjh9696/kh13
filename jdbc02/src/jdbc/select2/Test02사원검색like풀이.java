package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpMapper;
import jdbc.select.EmpDto;
import jdbc.util.JdbcHelper;

public class Test02사원검색like풀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("사원 이름 또는 부서 입력: ");
		String keyword = sc.nextLine();
		sc.close();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "SELECT * FROM emp WHERE emp_name LIKE ? OR emp_dept LIKE ? || '%'"
				+ " order by emp_name asc, emp_no asc";
        Object[] data = { "%" + keyword + "%", "%" + keyword + "%" };
		EmpMapper mapper = new EmpMapper();

		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);

		//출력
//		if(list.size() == 0) {
		if(list.isEmpty()) {
			System.out.println("검색결과가 존재하지 않습니다");
		}
		else {
			System.out.println("조회 결과 : " + list.size()+"개");
			for(EmpDto dto : list) {
				System.out.println("이름 : " + dto.getEmpName() +", " + "부서 : " + dto.getEmpDept());
			}
		}
	}

}
