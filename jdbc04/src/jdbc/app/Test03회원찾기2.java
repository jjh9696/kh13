package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test03회원찾기2 {

	public static void main(String[] args) {
//		원하는 아이디에 맞는 회원의 모든 정보를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 아이디 입력 : ");
		String memberId = sc.nextLine();
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		//출력
		if(dto != null) {
			System.out.println("<"+dto.getMemberId()+" 님의 정보>");
			System.out.println("닉네임 : " + dto.getMemberNick());
			System.out.println("이메일 : " + dto.getMemberEmail());
			System.out.println("연락처 : " + dto.getMemberContactStr());
			System.out.println("생년월일 : " + dto.getMemberBirthStr());
			System.out.print("주소 : ");
			System.out.print("["+dto.getMemberPostStr()+"]");
			System.out.print(dto.getMemberAddress1Str());
			System.out.print(" ");
			System.out.print(dto.getMemberAddress2Str());
			System.out.println();
			System.out.println("등급 : " + dto.getMemberLevel());
			System.out.println("포인트 : " + dto.getMemberPoint()+" point");
			System.out.println("가입일 : " + dto.getMemberJoin());
			System.out.println("마지막 로그인 : " + dto.getMemberLoginStr());
		}
		else {
			System.out.println("존재하지 않는 회원");
		}
	}

}
