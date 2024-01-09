package jdbc.delete;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴정보삭제 {

	public static void main(String[] args) {
		/*
		사용자에게 정보를 입력받아 메뉴정보를 삭제할 수 있도록 프로그램 구현
		단, 존재하지 않는 번호라면 그에 맞는 메세지 출력
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호 입력 : ");
		int menuNo = sc.nextInt();
		sc.close();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete menu where menu_no=?";
		Object[] data = {menuNo};
		
		int result = jdbcTemplate.update(sql,data);
		if (result>0) {
			System.out.println("메뉴 변경 완료");
		}
		else System.out.println("존재하지 않는 메뉴");
	}

}
