package jdbc.app;

import java.awt.SystemColor;
import java.util.Scanner;

import jdbc.dao.MenuDao;

public class Test09메뉴삭제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 메뉴 번호 입력 : ");
		int menuNo = sc.nextInt();
		sc.close();
		
		MenuDao dao = new MenuDao();
		boolean result = dao.delete(menuNo);
		
		if(result) {
			System.out.println("삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 번호");
		}
	}

}
