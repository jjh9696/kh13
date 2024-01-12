package jdbc.app;

import java.util.List;
import java.util.Scanner;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test16사원검색 {

	public static void main(String[] args) {
		/*
		EmpDao에 selectList 메소드를 만들어 사원에 대한 항목+키워드 검색이 가능하도록 구현하세요

		1.사원명, 2.부서명 : (1)
		검색어 : (홍길)

		검색 결과 : 2건
		- 홍길동 (인사팀)
		- 홍길남 (재무팀)
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 (1.사원명, 2.부서명) : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		String column;
		if(inputNum==1) {
			column = "emp_name";
		}
		else if (inputNum==2) {
			column = "emp_dept";
		}
		else {
			System.out.println("잘못입력");
			column=null;
			System.exit(0);
		}
		System.out.print("검색할 단어 입력 : ");
		String keyword = sc.nextLine();
		
		EmpDao dao = new EmpDao();
		List<EmpDto> list = dao.selectList(column, keyword);
		
		System.out.println("검색결과 : "+list.size()+"개");
		if (list.isEmpty()) {
			System.out.println("데이터 없음");
		}
		else {
			for(EmpDto dto : list) {
				System.out.println(dto.getEmpName()+"("+dto.getEmpDept()+")");
			}
		}
	}

}
