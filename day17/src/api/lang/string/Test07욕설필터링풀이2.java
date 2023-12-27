package api.lang.string;

import java.util.Scanner;

public class Test07욕설필터링풀이2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();
		
		String text[] = {"수박", "조카", "시베리아", "개나리", "신발끈", 
						"지옥", "주옥", "십장생", "십자수", "게불"};
		String star[]=new String[] {
				"",
				"*",
				"**",
				"***",
				"****",
				"*****"
		};
		for (int i = 0; i < text.length; i++) {//java버전이 낮아서 repeat가 없다면
			int count=text[i].length();
			input = input.replace(text[i],star[count]);
    	}
		System.out.println(input);
	}
}
