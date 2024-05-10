package com.kh.springtest01.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.springtest01.dto.MemberDto;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberDto> selectList(){
		return sqlSession.selectList("member.list");
	}
	public MemberDto selectOne(String memberId) {
		return sqlSession.selectOne("member.find", memberId);
	}
	public List<MemberDto> selectMemberIdList(){
		return sqlSession.selectList("member.listMemberId");
	}
	
}
