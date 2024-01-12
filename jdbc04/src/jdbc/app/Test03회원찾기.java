package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test03회원찾기 {

	public static void main(String[] args) {
//		원하는 아이디에 맞는 회원의 모든 정보를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 아이디 입력 : ");
		String memberId = sc.nextLine();
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		if (dto==null) {
			System.out.println("존재하지 않는 아이디");
		}
		else {
			System.out.println(dto);
		}
	}

}
