package com.kh.spring11.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring11.dto.PocketmonDto;
import com.kh.spring11.mapper.PocketmonMapper;
import com.kh.spring11.mapper.StatMapper;
import com.kh.spring11.vo.PageVO;
import com.kh.spring11.vo.StatVO;

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
	
	@Autowired
	private StatMapper statMapper;
	
	//변종메소드 - 포켓몬스터 개체수 통계
	public List<StatVO> statByType(){
		String sql = "select pocketmon_type 항목, count(*) 개수 "
				+ "from pocketmon group by pocketmon_type "
				+ "order by 개수 desc, pocketmon_type asc";
		return jdbcTemplate.query(sql, statMapper);
	}
	
	//통합 페이지
	public List<PocketmonDto> selectListByPaging(PageVO pageVO){
		if(pageVO.isSearch()) {//검색
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from pocketmon "
									+ "where instr("+pageVO.getColumn()+", ?) > 0 "
									+ "order by pocketmon_no desc"
								+ ") TMP"
							+ ") where rn between ? and ?";
			Object[] data = {
					pageVO.getKeyword(), 
					pageVO.getBeginRow(), 
					pageVO.getEndRow()
			};
			return jdbcTemplate.query(sql, mapper, data);
		}
		else {//목록
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from pocketmon "
									+ "order by pocketmon_no desc"
								+ ") TMP"
							+ ") where rn between ? and ?";
			Object[] data = {pageVO.getBeginRow(), pageVO.getEndRow()};
			return jdbcTemplate.query(sql, mapper, data);
		}
	}
	
	//카운트 - 목록일 경우와 검색일 경우를 각각 구현
	public int count(PageVO pageVO) {
		if(pageVO.isSearch()) {//검색
			String sql = "select count(*) from pocketmon "
					+ "where instr("+pageVO.getColumn()+", ?)>0";
			
			Object[] data = {pageVO.getKeyword()};
			return jdbcTemplate.queryForObject(sql,int.class, data);
		}
		else {//목록
			String sql = "Select count(*) from pocketmon";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
	}
	
	
}
