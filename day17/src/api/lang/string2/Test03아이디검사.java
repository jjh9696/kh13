package api.lang.string2;

import java.util.Scanner;

public class Test03아이디검사 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요(첫 글자는 소문자나 숫자, 전체 글자수는 5~20자, 소문자, 숫자, _, - 포함가능) : ");
		String id = sc.nextLine();
		
		String regex = "^[a-z0-9][a-z0-9\\_-]{4,19}$";
				
		if (id.matches(regex)) {
			System.out.println(id+"은(는) 올바른 아이디 입니다.");
		}
		else {
			System.out.println("올바른 아이디가 아닙니다.");
		}
	}
}
