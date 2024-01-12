package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test14메뉴상세 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 메뉴번호 입력 : ");
		int menuNo = sc.nextInt();
		
		MenuDao dao = new MenuDao();
		MenuDto dto = dao.selectOne(menuNo);
		
		if (dto==null) {
			System.out.println("존재하지 않는 메뉴");
		}
		else {
			System.out.println(dto.getMenuNameKor()+"("+dto.getMenuNameEng()+")-"+dto.getMenuType()+"-"+dto.getMenuPrice()+"원");
			
		}
		
		
	}

}
