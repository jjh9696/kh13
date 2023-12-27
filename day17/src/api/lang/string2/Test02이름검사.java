package api.lang.string2;

import java.util.Scanner;

public class Test02이름검사 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("성을 입력하세요 : ");
		String lastName=sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String firstname=sc.nextLine();
		
		if(!lastName.matches("^[가-힣]{1,2}$")||!firstname.matches("^[가-힣]{1,5}$")) {
			System.out.println("올바른 이름이 아닙니다.");
		}
		else {
			System.out.println(lastName+firstname+"은(는) 올바른 이름입니다.");
		}
	}
}
