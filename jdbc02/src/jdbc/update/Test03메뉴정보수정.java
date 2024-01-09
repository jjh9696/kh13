package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴정보수정 {

	public static void main(String[] args) {

		//사번을 이용해서 사원명,부서,입사일,급여를 변경하도록 구현
		//- 수정은 실패할 수도 있다(에러가 아니라 대상이 없는 경우)
	
		Scanner sc = new Scanner(System.in);
		System.out.print("한글메뉴 : ");
		String menuNameKor = sc.nextLine();
		System.out.print("영어메뉴 : ");
		String menuNameEng = sc.nextLine();
		System.out.print("종류 : ");
		String menuType = sc.nextLine();
		System.out.print("판매가 : ");
		int menuPrice = sc.nextInt();
		sc.nextLine();
		System.out.print("메뉴번호 : ");
		int menuNo = sc.nextInt();
		sc.close();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update menu "
					+"set menu_name_kor=?, menu_name_eng=?, "
					+"menu_type=?, menu_price=? "
					+"where menu_no=?";
		Object[] data = {menuNameKor,menuNameEng,menuType,menuPrice,menuNo};
//		jdbcTemplate.update(sql,data);
		int rowCount = jdbcTemplate.update(sql,data);
		if (rowCount>0) {
			System.out.println("변경완료");
		}	
		else System.out.println("잘못된 입력");
		
		
	}

}
