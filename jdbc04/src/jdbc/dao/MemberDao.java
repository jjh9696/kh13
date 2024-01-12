package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcHelper;

//member 테이블 데이터 처리를 담당하는 클래스
public class MemberDao {
	//메소드에서 공용으로 사용하는 도구들을 생성
	private JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
	private MemberMapper mapper = new MemberMapper();
	
	//가입(등록, Create) Test01
	public void insert(MemberDto dto) {
		String sql = "insert into member("
							+ "member_id, member_pw, member_nick, "
							+ "member_birth,member_contact, member_email, "
							+ "member_post, member_address1, member_address2"
						+ ") values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		String sql = "insert into member("
//							+ "member_id, member_pw, member_nick, "
//							+ "member_birth,member_contact, member_email, "
//							+ "member_post, member_address1, member_address2,"
//							+ "member_level, member_point, member_join, member_login"
//						+ ") values(?, ?, ?, ?, ?, ?, ?, ?, ?, '일반회원', 0, sysdate, null)";
		Object[] data = {
			dto.getMemberId(), dto.getMemberPw(), dto.getMemberNick(),
			dto.getMemberBirth(), dto.getMemberContact(), dto.getMemberEmail(),
			dto.getMemberPost(), dto.getMemberAddress1(), dto.getMemberAddress2()
		};
		jdbcTemplate.update(sql, data);
	}

	//수정
	public boolean update(MemberDto dto) {
		String sql = "update member set "
				+ "member_id=?, member_pw=?, member_nick=?, member_birth=?, member_contact=?, member_email=?, member_post=?, member_address1=?, member_address2=?";
		Object[] data = {
				dto.getMemberId(), dto.getMemberPw(), dto.getMemberNick(), dto.getMemberBirth(), dto.getMemberContact(), dto.getMemberEmail(), dto.getMemberPost(), dto.getMemberAddress1(), dto.getMemberAddress2()
		};
		return jdbcTemplate.update(sql, data)>0;
	}
	//삭제
	public boolean delete (String memberId) {
		String sql = "delete member where member_id=?";
		Object[] data = {memberId};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//목록(조회, Read) Test02
	public List<MemberDto> selectList(){
		String sql = "select * from member order by member_id asc";
//		Object[] data = {}
		return jdbcTemplate.query(sql, mapper);
	}
	
	//상세(조회, Read) Test03
	public MemberDto selectOne(String memberId) {
		String sql = "select * from member where member_id=?";
		Object[] data = {memberId};
		List<MemberDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//검색
	public List<MemberDto> selectList(String column,String keyword){
		String sql = "select * from member where instr("+column+",?)>0";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}
	
}
