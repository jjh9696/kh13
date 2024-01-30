package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardListMapper;
import com.kh.spring10.mapper.BoardMapper;

@Repository
public class BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardMapper boardMapper = new BoardMapper();
	
	@Autowired
	private BoardListMapper boardListMapper = new BoardListMapper();
	
	//시퀀스 값 받아오기
    public int getSeq() {
        String sql = "SELECT board_seq.nextval FROM dual";
        // queryForObject 메서드를 사용하여 시퀀스 값을 받아옵니다.
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
	
	//게시글 작성
	public void insert(BoardDto boardDto) {
		String sql = "insert into board("
				+ "board_no, board_title, board_content, "
				+ "board_writer"
				+ ") values(?, ?, ?, ?)";
		Object[] data= {boardDto.getBoardNo(), boardDto.getBoardTitle(), 
				boardDto.getBoardContent(), boardDto.getBoardWriter()
		};
		jdbcTemplate.update(sql,data);
	}
	
	//게시글 수정
	public boolean update(BoardDto boardDto) {
		String sql = "update board set " //작성자 넣어줘야하나
				+ "board_title=?, board_content=?, board_etime=sysdate, "
				+ "board_writer";
		Object[] data = {
				boardDto.getBoardTitle(), boardDto.getBoardContent(), 
				boardDto.getBoardWriter()
		};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//게시글 삭제
	public boolean delete(int boardNo) {
		String sql ="delete board where board_no=?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//목록
	public List<BoardDto> selectList() {
//			String sql = "select * from board order by board_no desc";
//			return jdbcTemplate.query(sql, boardMapper);

		String sql = "select "
							+ "board_no, board_title, board_writer, "
							+ "board_wtime, board_etime, board_readcount "
						+ "from board order by board_no desc";
		return jdbcTemplate.query(sql, boardListMapper);
	}
	//검색
	
	public List<BoardDto> selectList(String column, String keyword) {
//			String sql = "select * from board "
//							+ "where instr("+column+", ?) > 0 "
//							+ "order by board_no desc";
//			Object[] data = {keyword};
//			return jdbcTemplate.query(sql, boardMapper, data);

		String sql = "select "
							+ "board_no, board_title, board_writer, "
							+ "board_wtime, board_etime, board_readcount "
						+ "from board "
						+ "where instr("+column+", ?) > 0 "
						+ "order by board_no desc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, boardListMapper, data);
	}
	
	//게시글 상세 조회
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
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
