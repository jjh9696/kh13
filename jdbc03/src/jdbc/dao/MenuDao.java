package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.EmpDto;
import jdbc.dto.MenuDto;
import jdbc.util.JdbcHelper;

public class MenuDao {

	//등록 메소드
	public void insert(MenuDto dto) {
		JdbcTemplate jdbcTemplate=JdbcHelper.getJdbcTemplate();
		String sql="insert into menu("
				+ "menu_no, menu_name_kor,menu_name_eng,menu_type,menu_price) "
				+ "values(menu_seq.nextval,?,?,?,?)";
		Object[] data= {
				dto.getMenuNameKor(),dto.getMenuNameEng(),
				dto.getMenuType(),dto.getMenuPrice()
		};
		jdbcTemplate.update(sql,data);
		
	}
	
	//수정메소드
	public boolean update(MenuDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "update menu set menu_name_kor=?,menu_name_eng=?,menu_type=?,menu_price =? where menu_no=?";
		Object[] data={
				dto.getMenuNameKor(),dto.getMenuNameEng(),dto.getMenuType(),dto.getMenuPrice(),dto.getMenuNo()
		};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//삭제메소드
	public boolean delete(int menuNo) {
		JdbcTemplate jdbcTemplate =  JdbcHelper.getJdbcTemplate();
		String sql = "delete menu where menu_no=?";
		Object[] data = {menuNo};
		return jdbcTemplate.update(sql,data)>0;
	}
}
