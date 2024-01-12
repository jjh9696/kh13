package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test05회원탈퇴 {

    public static void main(String[] args) {
        // 사용자에게 아이디와 비밀번호를 입력받아 회원 탈퇴

        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요: ");
        String memberId = scanner.next();

        System.out.print("비밀번호를 입력하세요: ");
        String memberPw = scanner.next();

        scanner.close();

        MemberDao dao = new MemberDao();
        MemberDto find = dao.selectOne(memberId);
        
        // 입력받은 아이디와 비밀번호로 회원 탈퇴 진행
		if(find!=null&&find.getMemberId().equals(memberId)) {
	        	dao.delete(memberId);
	        	System.out.println("회원 탈퇴 완료");
		}
		else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
    }
}