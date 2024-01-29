package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardMapper;

@Repository
public class BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardMapper boardMapper = new BoardMapper();
	
	//게시글 작성
	public void insert(BoardDto boardDto) {
		String sql = "insert into board("
				+ "board_no, board_title, board_content, "
				+ "board_writer, board_wtime, board_etime"
				+ ") values(board_seq.nextval, ?, ?, ?, ?, ?)";
		Object[] data= {boardDto.getBoardTitle(), boardDto.getBoardContent(), 
				boardDto.getBoardWriter(), boardDto.getBoardWtime(), 
				boardDto.getBoardEtime()
		};
		jdbcTemplate.update(sql,data);
	}
	
	//게시글 수정
	public boolean update(BoardDto boardDto) {
		String sql = "update board set "
				+ "board_title=?, board_content=?, board_etime=?";
		Object[] data = {
				boardDto.getBoardTitle(), boardDto.getBoardContent(), boardDto.getBoardEtime()
		};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//게시글 삭제
	public boolean delete(int boardNo) {
		String sql ="delete board where board_no=?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//게시글 목록 조회
	public List<BoardDto> selectList(){
		String sql = "select * from board order by board_no=? desc";
		return jdbcTemplate.query(sql, boardMapper);
	}
	
	//게시글 검색 조회
	public List<BoardDto> selectList(String column, String keyword){
		String sql ="select * from board where instr("+column+",?) > 0 "
				+ "order by "+column+" asc, board_no desc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, boardMapper, data);
				
	}
	
	//게시글 상세 조회
	public BoardDto selectOne(int boardNo) {
		String sql = "select board where board_no=?";
		Object[] data = {boardNo};
		List<BoardDto> list = jdbcTemplate.query(sql, boardMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//게시글 작성 시간 최신화
	public boolean updateWtime(int boardNo) {
		String sql = "update board set "
				+ "board_wtime=sysdate "
				+ "where board_no=?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql,data)>0;
	}
}
