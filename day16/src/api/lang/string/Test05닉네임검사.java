package api.lang.string;

import java.util.Scanner;

public class Test05닉네임검사 {

	private static boolean checkNickname(String nickname) {
		if (nickname.length() < 2 || nickname.length() > 10) {
			return false;
		}
		if (nickname.contains("운영자")) {
			System.out.println("\"운영자\"는 금지 단어입니다.");
			return false;
		}
//		if (nickname.indexOf("운영자")>=0) { //다른 언어에서는 이런 방식으로 사용해야 하기 때문에 이 코드가 범용성이 좋다
//		System.out.println("\"운영자\"는 금지 단어입니다.");
//			return false;
//		}
		if (!nickname.matches("[가-힣0-9]+")) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("닉네임을 입력하세요: ");
        String nickname = sc.nextLine();
        
        if (checkNickname(nickname)) {
            System.out.println("사용 가능한 닉네임입니다.");
        } 
        else {
            System.out.println("한글 또는 숫자 2~10 글자로 생성하세요.");
        }
	}
	

}
