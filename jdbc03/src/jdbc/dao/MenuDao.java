package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MenuDto;
import jdbc.mapper.MenuMapper;
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
	
	//목록메소드
	public List<MenuDto> selectlist(){
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from menu order by menu_no asc";
		MenuMapper mapper = new MenuMapper();
		return jdbcTemplate.query(sql, mapper);
	}
	
	//상세메소드
	public MenuDto selectOne(int menuNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from menu where menu_no=?";
		Object[] data = {menuNo};
		MenuMapper mapper = new MenuMapper();
		List<MenuDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
}
