package jdbc.app;

import java.util.Scanner;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test12사원찾기 {

	public static void main(String[] args) {
		/*
		EmpDao에 메소드를 만들고 사번에 대한 사원정보를 조회하도록 구현
		모든 정보를 다 출력
		(단, 존재하지 않는 사번일 경우 따로 메세지를 출력)
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 사번 입력 : ");
		int empNo = sc.nextInt();
		sc.close();
		
		EmpDao dao = new EmpDao();
		EmpDto dto = dao.selectOne(empNo);
		
		if (dto==null) {
			System.out.println("존재하지 않는 사번");
		}
		else {
			System.out.println(dto.getEmpNo()+"."+dto.getEmpName()+" "+
		dto.getEmpDept()+"("+dto.getEmpDate()+" 입사) 급여:"+dto.getEmpSal());
		}
	}

}
