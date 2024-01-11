package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test05사원정보변경 {

	public static void main(String[] args) {

		
		EmpDto dto = new EmpDto();
		dto.setEmpNo(1);
		dto.setEmpName("김김김");
		dto.setEmpDept("김부서");
		dto.setEmpDate("2022-02-22");
		dto.setEmpSal(500);
		
		EmpDao dao = new EmpDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("사원 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 사원 번호");
		}
		
	}

}
