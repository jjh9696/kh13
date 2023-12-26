package api.lang.string;

import java.util.Scanner;

public class Test03로그인 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		if (id.equals("khacademy")&&password.equals("adminuser")) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("입력한 정보가 잘못되었습니다.");
		}
	}
}
