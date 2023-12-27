package api.lang.string2;

import java.util.Scanner;

public class Test02이름검사풀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("성을 입력하세요 : ");
		String name=sc.nextLine();
		//참고 낱자까지 모두 검사하고 싶다면 [ㄱ-ㅎ ㅏ-ㅣ 가-힣]{2,7}
		if(!name.matches("^[가-힣]{1,2}[가-힣]{1,5}$")) {
			System.out.println("올바른 이름이 아닙니다.");
		}
		else {
			System.out.println(name+"은(는) 올바른 이름입니다.");
		}
	}
}
