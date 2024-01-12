package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경 {

	public static void main(String[] args) {
//		사용자에게 아이디와 비밀번호를 입력받아 비밀번호만 변경
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String inputId = sc.nextLine();
		System.out.print("변경할 비밀번호 : ");
		String inputPw = sc.nextLine();
		
		sc.close();
		
		MemberDto dto = new MemberDto();
		dto.setMemberId(inputId);
		dto.setMemberPw(inputPw);
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberPw(dto);
		
		if(result) {
				System.out.println("비밀번호 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 아이디");
			
		}
	}

}
