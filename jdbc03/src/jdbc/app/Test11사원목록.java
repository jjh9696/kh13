package jdbc.app;

import java.util.List;

import jdbc.dao.EmpDao;
import jdbc.dao.MenuDao;
import jdbc.dto.EmpDto;

public class Test11사원목록 {

	public static void main(String[] args) {
		/*
		EmpDao에 메소드를 만들어 사원목록을 출력
		이름, 부서만 출력
		*/
		
		EmpDao dao = new EmpDao();
		List<EmpDto> list = dao.selectList();
		
		for(EmpDto empDto : list) {
			System.out.println(empDto.getEmpName()+" "+empDto.getEmpDept());
		}
		
		
	}

}
