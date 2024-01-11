package jdbc.app;

import java.util.Scanner;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test02사원등록 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		EmpDto dto = new EmpDto();
		dto.setEmpName(sc.nextLine());
		dto.setEmpDept(sc.nextLine());
		dto.setEmpDate(sc.nextLine());
		dto.setEmpSal(sc.nextInt());
		sc.nextLine();
		EmpDao dao = new EmpDao();
		dao.insert(dto);
		
		System.out.println("사원 등록 완료");
	}

}
