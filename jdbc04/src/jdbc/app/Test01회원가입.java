package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test01회원가입 {

	public static void main(String[] args) {
		/*
		사용자에게 필요한 정보를 입력받아 가입처리
		선택 항목은 엔터를 치면 입력을 안하고 넘어갈 수 있음
		*/
		Scanner sc = new Scanner(System.in);
		//데이터 준비
		//- 입력 항목 : 아이디, 비밀번호, 닉네임, 연락처, 생년월일, 이메일, 주소
		//- 13개의 항목 중에서 9개를 입력받아야 한다 (4개가 필수 항목)
		MemberDto dto = new MemberDto();
		dto.setMemberId("testuser1");
		dto.setMemberPw("Testuser1!");
		dto.setMemberNick("테스트유저1");
		dto.setMemberEmail("testuser1@kh.com");
		
		//처리
		MemberDao dao = new MemberDao();
		dao.insert(dto);
		
		//출력
		System.out.println("회원 가입 완료");
		
	}

}
