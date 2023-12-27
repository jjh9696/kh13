package api.lang.string;

import java.util.Scanner;

public class Test07욕설필터링풀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();
		
		String text[] = {"수박", "조카", "시베리아", "개나리", "신발끈", 
						"지옥", "주옥", "십장생", "십자수", "게불"};
		String star="*";
		for (int i = 0; i < text.length; i++) {//repeat를 사용
//			if (input.contains(text[i])) {
			int count=text[i].length();
			input = input.replace(text[i],star.repeat(count));
//			}
    	}
		System.out.println(input);
	}
}
