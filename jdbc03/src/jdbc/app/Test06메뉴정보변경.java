package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MenuDao;
import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test06메뉴정보변경 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		MenuDto dto = new MenuDto();
		System.out.print("메뉴번호 : ");
		dto.setMenuNo(sc.nextInt());
		sc.nextLine();
		System.out.print("메뉴 한글 이름 : ");
		dto.setMenuNameKor(sc.nextLine());
		System.out.print("메뉴 영문 이름 : ");
		dto.setMenuNameEng(sc.nextLine());
		System.out.print("메뉴 종류 : ");
		dto.setMenuType(sc.nextLine());
		System.out.print("메뉴 가격 : ");
		dto.setMenuPrice(sc.nextInt());
		sc.close();
		
		MenuDao dao = new MenuDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("메뉴 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴 번호");
		}
	}

}
