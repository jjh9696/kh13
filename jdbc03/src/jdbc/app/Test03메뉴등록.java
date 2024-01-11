package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test03메뉴등록 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MenuDto dto = new MenuDto();
		dto.setMenuNameKor(sc.nextLine());
		dto.setMenuNameEng(sc.nextLine());
		dto.setMenuType(sc.nextLine());
		dto.setMenuPrice(sc.nextInt());
		sc.nextLine();
		MenuDao dao = new MenuDao();
		dao.insert(dto);
		
		System.out.println("메뉴 등록 완료");
	}
	
}
