package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test02회원목록 {

	public static void main(String[] args) {
//		전체 회원의 목록을 아이디 순서로 조회
		
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.selectList();

		System.out.println("전체 회원 수 : " + list.size());
		for(MemberDto dto : list) {
			System.out.print(dto.getMemberId());
			System.out.print("(");
			System.out.print(dto.getMemberNick());
			System.out.print(")");
			System.out.println();
		}
	}
}
