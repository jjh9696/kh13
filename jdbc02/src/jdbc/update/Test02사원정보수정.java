package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원정보수정 {

	public static void main(String[] args) {
		
		//사번을 이용해서 사원명,부서.입사일,급여를 변경하도록 구현
		//-수정은 실패할수도
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String empName = sc.nextLine();
		System.out.print("부서 : ");
		String empDept = sc.nextLine();
		System.out.print("입사일 : ");
		String empDate = sc.nextLine();
		System.out.print("급여 : ");
		int empSal = sc.nextInt();
		sc.nextLine();
		System.out.print("사원번호 : ");
		int empNo = sc.nextInt();
		sc.close();
		
		
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "UPDATE emp " 
	             +"SET emp_name=?, emp_dept=?, " 
	             +"emp_date=?, emp_sal=? "  
	             +"WHERE emp_no=?";
		Object[] data = {empName,empDept,empDate,empSal,empNo};
		jdbcTemplate.update(sql,data);
		
		int rowCount = jdbcTemplate.update(sql,data);
		if (rowCount>0) {
			System.out.println("변경완료");
		}	
		else System.out.println("잘못된 입력");
	}

}
