package jdbc.select;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴조회 {

	public static void main(String[] args) {
		/*
		다음 보조 클래스들을 만드시고 메뉴 목록을 조회하세요
		필요하다면 메뉴 더미데이터를 생성한 뒤 진행하세요
		(ChatGPT 시키면 잘 만들어줍니다)

		MenuDto : 데이터 변환 객체
		MenuMapper : ResultSet 변환 클래스

		(추가) 사용자에게 메뉴명을 입력받아 검색한 결과를 보여주도록 변경해보세요
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("왕돈까스/커피/주스 中 택 1");
		String a = sc.nextLine();
		
		String sql = "SELECT * FROM menu WHERE menu_name_kor = ? ORDER BY menu_no ASC";
		Object[] data = {a};
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		MenuMapper mapper = new MenuMapper();
		
//		List<MenuDto> list = jdbcTemplate.query(sql, mapper);
		List<MenuDto> list = jdbcTemplate.query(sql, mapper,data);
		System.out.println("조회 결과 수 : "+list.size());
		
		 for (MenuDto menuDto : list) {
			 System.out.println(menuDto.getMenuNo() + " | " + menuDto.getMenuNameKor() + " | " + menuDto.getMenuNameEng() + " | "
					 + menuDto.getMenuType() + " | " + menuDto.getMenuPrice());
		 }
	}

}
