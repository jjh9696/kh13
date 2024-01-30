package com.kh.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring10.dto.BoardDto;

@Service
public class BoardMapper implements RowMapper<BoardDto> {

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto boardDto = new BoardDto();
		boardDto.setBoardNo(rs.getInt("board_no"));
		boardDto.setBoardTitle(rs.getString("board_title"));
		boardDto.setBoardContent(rs.getString("board_content"));
		//4000바이트, 게시글이 늘어나면 늘어날수록 용량이 다른 항목에 비해 커서 빼버린다
		boardDto.setBoardWriter(rs.getString("board_writer"));
		boardDto.setBoardWtime(rs.getDate("board_wtime"));
		boardDto.setBoardEtime(rs.getDate("board_etime"));
		boardDto.setBoardReadCount(rs.getInt("board_readCount"));
		return boardDto;
	}

}
