package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.MenuDto;

@Repository
public class MenuDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<MenuDto> selectList() {
		return sqlSession.selectList("menu.list");
	}
	
	public void insert(MenuDto menuDto) {
		sqlSession.insert("menu.add", menuDto);
	}
	
	public boolean update(MenuDto menuDto) {
		return sqlSession.update("menu.edit", menuDto) > 0;
	}
	
	public boolean delete(int menuNo) {
		return sqlSession.delete("menu.remove", menuNo) > 0; 
	}
	
	public MenuDto selectOne(int menuNo) {
		return sqlSession.selectOne("menu.find", menuNo);
	}
	
}