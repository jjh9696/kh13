package com.kh.spring15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ComplexSearchTest04 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		String column = "member_id";
		String keyword = "test";
		
		//column과 keyword 유무에 따라 mybatis 구문이 변화하여 실행된다
		//즉, 자바에서는 조건으로 검색인지 목록인지 구분할 필요가 없다(DB에 관해서)
		Map<String, Object> data = new HashMap<>();
//		data.put("memberId", "test");
//		data.put("memberNick", "테스트");
//		data.put("memberContact", "01012345678");
//		data.put("minPoint", "10000");
//		data.put("maxPoint", "30000");
//		data.put("memberJoin", "2024-01-31");
//		data.put("minLoginDate", "2024-03-01");
//		data.put("maxLoginDate", "2024-03-15");
//		data.put("memberLevelList", List.of()); //값이 없으니 구문이 작동안됨 select * from member가 작동 됨
//		data.put("memberLevelList", List.of("일반회원"));
//		data.put("memberLevelList", List.of("일반회원", "우수회원"));
//		data.put("memberLevelList", List.of("일반회원", "우수회원", "관리자"));
//		data.put("orderList", List.of("member_nick asc", "member_point desc"));
		
		data.put("beginRow", 1);
		data.put("endRow", 10);
		
		
		
		List<MemberDto> list = sqlSession.selectList("member.complex", data);
		for(MemberDto memberDto : list) {
			log.debug("member = {}", memberDto);
		}
		
	}
}
