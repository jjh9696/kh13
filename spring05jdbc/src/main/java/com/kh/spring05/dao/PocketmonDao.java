package com.kh.spring05.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PocketmonDto;
import com.kh.spring05.mapper.PocketmonMapper;

//DAO도 이제부터는 등록을 해야한다
//-@Repository는 파일이나 데이터베이스와 같이 영속성(영원함) 개체를 제어하는 도구
@Repository
public class PocketmonDao {
	
	@Autowired //이걸 누락시켜도 에러가 안나지만 실행하면 에러가 남
	private JdbcTemplate jdbcTemplate;
	
	@Autowired	
	private PocketmonMapper mapper;
	
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon("
				+"pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+ ") values (?,?,?)";
		Object[] data = {
				dto.getPocketmonNo(),dto.getPocketmonName(),dto.getPocketmonType()
		};
		jdbcTemplate.update(sql,data);
		
	}
	
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon "
				+ "set pocketmon_name=?, pocketmon_type=? "
				+ "where pocketmon_no=?";
		Object[] data = {dto.getPocketmonName(), dto.getPocketmonType(),
				dto.getPocketmonNo()};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	public boolean delete(int pocketmonNo) {
		String sql = "delete pocketmon where pocketmon_no=?";
		Object[] data = {pocketmonNo};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	public List<PocketmonDto> selectList(){
		String sql = "select * from pocketmon order by pocketmon_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public List<PocketmonDto> selectList(String column, String keyword) {
		String sql = "select * from pocketmon where instr("+column+", ?) > 0 "
										+ "order by "+column+" asc, pocketmon_no asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}
	
	public PocketmonDto selectOne(int pocketmonNo) {
		String sql = "select * from pocketmon where pocketmon_no=?";
		Object[] data = {pocketmonNo};
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
}