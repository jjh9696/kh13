package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpDto;
import jdbc.select.EmpMapper;
import jdbc.select.MenuDto;
import jdbc.util.JdbcHelper;

public class Test04사원항목검색 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1.이름, 2.부서, 3.입사일 :");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		String column = null;
		
		if (inputNum==1) {
			column = "emp_name";
		}
		else if (inputNum==2) {
			column = "emp_dept";
		}
		else if (inputNum==3) {
			column = "emp_date";
		}
		else {
			System.out.println("잘못입력");
		}
		
		String keyword = "영";
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		EmpMapper mapper = new EmpMapper();
		
		String sql = "select * from emp "
				+ "where instr("+column+", ?) > 0";
		
		Object data[] = {keyword};
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
		if(list.isEmpty()) {
			System.out.println("결과없음");
		}
		else {
			System.out.println("조회 결과 : " + list.size()+"개");
			for (EmpDto dto : list) {
				System.out.println(dto.getEmpName()+" "+dto.getEmpDept()+" "+dto.getEmpDate());
			}
			
		}
			
	}

}
