package com.kh.springtest01.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.springtest01.dto.MemberDto;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MemberDto selectOne(String memberId) {
		return sqlSession.selectOne("member.find", memberId);
	}
}
