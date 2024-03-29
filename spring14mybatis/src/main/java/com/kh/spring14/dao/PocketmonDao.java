package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.PocketmonDto;

@Repository
public class PocketmonDao {
	
//  다른 기술을 사용하니 이제 이건 사용하지 않는다
//	@Autowired 
//	private JdbcTemplate jdbcTemplate; //Spring JDBC

	@Autowired
	private SqlSession sqlSession;//myBatis

	public List<PocketmonDto> selectList() {
		//return pocketmon 영역의 list라는 구문을 실행해서 나온 결과;
		return sqlSession.selectList("pocketmon.list");
	}
	
	//오브젝트 배열이 사라짐, 알아서 pocketmonDto를 넣어라
	public void insert(PocketmonDto pocketmonDto) {
		sqlSession.insert("pocketmon.add", pocketmonDto);
	}
	
	public boolean update(PocketmonDto pocketmonDto) {
		return sqlSession.update("pocketmon.edit", pocketmonDto) > 0;
	}
	
	public boolean delete(int pocketmonNO) {
		return sqlSession.delete("pocketmon.remove", pocketmonNO) > 0;
	}
	
	//상세조회를 구현하는 방법은 두가지
	//1. selectList를 사용해서 목록으로 처리 - 여러개 나와도 에러가 안남(x)
	//2. selectOne을 사용해서 상세조회 처리 - 여러개 나오면 에러가 발생(o)
	public PocketmonDto selectOne(int pocketmonNO) {
		//1
//		List<PoctetmonDto> list=
//			sqlSession.selectList("pocketmon.find",pocketmonNo);
//		return list.isEmpty() ? null : list.get(0);
		
		//2
		return sqlSession.selectOne("pocketmon.find", pocketmonNO);
	}
}
