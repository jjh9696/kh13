package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경2 {

	public static void main(String[] args) {
//		사용자에게 아이디와 비밀번호를 입력받아 비밀번호만 변경
		
		//현재 비밀번호 입력 추가
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		System.out.print("아이디 : ");
		dto.setMemberId(sc.nextLine());
		System.out.print("현재 비밀번호 : ");
		String currentPw = sc.nextLine();
		System.out.print("바꿀 비밀번호 : ");
		dto.setMemberPw(sc.nextLine());
		
		sc.close();
		
		//현재 비밀번호 판정 추가
		MemberDao dao = new MemberDao();
		MemberDto find = dao.selectOne(dto.getMemberId());
		if(find != null && find.getMemberPw().equals(currentPw)) {
			//업데이트
			dao.update(dto);
			dao.updateMemberPw(dto);
			System.out.println("비밀번호 변경 완료");
		}
		else {
			System.out.println("정보가 일치하지 않습니다");
		}
		
	}
}
