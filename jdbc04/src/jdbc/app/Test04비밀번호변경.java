package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경 {

	public static void main(String[] args) {
//		사용자에게 아이디와 비밀번호를 입력받아 비밀번호만 변경
		
		Scanner sc = new Scanner(System.in);
		
		String inputId = sc.nextLine();
		String inputPw = sc.nextLine();
		
		MemberDto dto = new MemberDto();
		
		MemberDao dao = new MemberDao();
		boolean result = dao.update(dto);
		
		if(result) {
			if(dto.getMemberId().equals(inputId)&&dto.getMemberId()!=null) {
				dto.setMemberPw(inputPw);
				System.out.println("비밀번호 변경 완료");
				
			}
		}
		else {
			System.out.println("존재하지 않는 아이디");
			
		}
	}

}
