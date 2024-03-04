package com.kh.spring11.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring11.dto.MemberDto;
import com.kh.spring11.mapper.MemberMapper;
import com.kh.spring11.mapper.StatMapper;
import com.kh.spring11.vo.StatVO;


//member 테이블 데이터 처리를 담당하는 클래스
@Repository
public class MemberDao {
	//메소드에서 공용으로 사용하는 도구들을 생성
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MemberMapper mapper = new MemberMapper();
	
	//가입(등록, Create) Test01
	public void insert(MemberDto dto) {
		String sql = "insert into member("
							+ "member_id, member_pw, member_nick, "
							+ "member_birth, member_contact, member_email, "
							+ "member_post, member_address1, member_address2"
						+ ") values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		String sql = "insert into member("
//							+ "member_id, member_pw, member_nick, "
//							+ "member_birth,member_contact, member_email, "
//							+ "member_post, member_address1, member_address2,"
//							+ "member_level, member_point, member_join, member_login"
//						+ ") values(?, ?, ?, ?, ?, ?, ?, ?, ?, '일반회원', 0, sysdate, null)";	//디폴트 값을 쓰는게 아닌 내가 넣어주는 경우
		Object[] data = {
			dto.getMemberId(), dto.getMemberPw(), dto.getMemberNick(),
			dto.getMemberBirth(), dto.getMemberContact(), dto.getMemberEmail(),
			dto.getMemberPost(), dto.getMemberAddress1(), dto.getMemberAddress2()
		};
		jdbcTemplate.update(sql, data);
	}

	//수정 (Update)
	public boolean update(MemberDto dto) {
		String sql = "update member set "
				+ "member_id=?, member_pw=?, member_nick=?, member_birth=?, member_contact=?, member_email=?, member_post=?, member_address1=?, member_address2=?";
		Object[] data = {
				dto.getMemberId(), dto.getMemberPw(), dto.getMemberNick(), dto.getMemberBirth(), dto.getMemberContact(), dto.getMemberEmail(), dto.getMemberPost(), dto.getMemberAddress1(), dto.getMemberAddress2()
		};
		return jdbcTemplate.update(sql, data)>0;
	}
	
	//비밀번호 변경(수정, Update) Test04
	public boolean updateMemberPw(MemberDto dto) {
		String sql = "update member set "
				+ "member_pw=? where member_id=?";
		Object[] data = {
				dto.getMemberPw(), dto.getMemberId()
		};
		return jdbcTemplate.update(sql, data)>0;
	}
	
	//삭제 Test05 (회원탈퇴, 삭제/Delete)
	public boolean delete (String memberId) {
		String sql = "delete member where member_id=?";
		Object[] data = {memberId};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//목록(조회, Read) Test02,06
	public List<MemberDto> selectList(){
		String sql = "select * from member order by member_id asc";
//		Object[] data = {}
		return jdbcTemplate.query(sql, mapper);
	}
	
	//상세(조회, Read) Test01,03,04,05,06
	public MemberDto selectOne(String memberId) {
		String sql = "select * from member where member_id=?";
		Object[] data = {memberId};
		List<MemberDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//검색(조회, Read)
	public List<MemberDto> selectList(String column, String keyword) {
		String sql = "select * from member where instr("+column+", ?) > 0 "
										+ "order by "+column+" asc, member_id asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}
	
	//최종로그인시각 변경(수정, Update)
	public boolean updateMemberLogin(String memberId) {
		String sql="update member set "
				+ "member_login=sysdate "
				+ "where member_id=?";
		Object data[]= {memberId};
		return jdbcTemplate.update(sql, data)>0;
	}
	
	//회원이 자신의 정보를 변경(수정, Update)
	public boolean updateMember(MemberDto memberDto) {
		String sql="update member set "
				+ "member_nick=?, member_email=?, member_birth=?, "
				+ "member_contact=?, member_post=?, "
				+ "member_address1=?, member_address2=? "
				+ "where member_id=?";
		Object[] data= {
				memberDto.getMemberNick(), memberDto.getMemberEmail(), 
				memberDto.getMemberBirth(), memberDto.getMemberContact(), 
				memberDto.getMemberPost(), memberDto.getMemberAddress1(), 
				memberDto.getMemberAddress2(), memberDto.getMemberId()
		};
		return jdbcTemplate.update(sql, data)>0;
	}
	
	@Autowired
	private StatMapper statMapper;
	
	//변종메소드
	public List<StatVO> statByLevel(){
		String sql = "select member_level 항목, count(*) 개수 "
				+ "from member group by member_level "
				+ "order by 개수 desc, member_level asc";
		return jdbcTemplate.query(sql, statMapper);
	}
	
	//관리자에 의한 회원 정보 수정
	public boolean updateMemberByAdmin(MemberDto memberDto) {
		String sql="update member set "
				+ "member_nick=?, member_email=?, member_birth=?, "
				+ "member_contact=?, member_post=?, "
				+ "member_address1=?, member_address2=?, "
				+ "member_level=?, member_point=? "
				+ "where member_id=?";
		Object[] data= {
				memberDto.getMemberNick(), memberDto.getMemberEmail(), 
				memberDto.getMemberBirth(), memberDto.getMemberContact(), 
				memberDto.getMemberPost(), memberDto.getMemberAddress1(), 
				memberDto.getMemberAddress2(), memberDto.getMemberLevel(), 
				memberDto.getMemberPoint(), memberDto.getMemberId()
		};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	
	//프로필 이미지 연결
	public void connect(String memberId, int attachNo) {
		String sql = "insert into member_attach(member_id, attach_no) "
						+ "values(?, ?)";
		Object[] data = {memberId, attachNo};
		jdbcTemplate.update(sql, data);
	}

	public int findAttachNo(String memberId) {
		String sql = "select attach_no from member_attach where member_id = ?";
		Object[] data = {memberId};
		return jdbcTemplate.queryForObject(sql, int.class, data);
	}
	
	//포인트 충전/차감
	public boolean plusMemberPoint(String memberId, int point) {
		String sql="update member set member_point = member_point + ? "
				+ "where member_id=?";
		Object[] data = {point, memberId};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public boolean minusMemberPoint(String memberId, int point) {
		String sql="update member set member_point = member_point - ? "
				+ "where member_id=?";
		Object[] data = {point, memberId};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//닉네임 조회
	public MemberDto selectOneByMemberNick(String memberNick) {
	    String sql = "SELECT * FROM member WHERE member_Nick=?";
	    Object[] data = {memberNick};
	    List<MemberDto> list = jdbcTemplate.query(sql, mapper, data);
	    return list.isEmpty() ? null : list.get(0);
	}
}