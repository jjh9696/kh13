package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06끝말잇기게임 {

	public static void main(String[] args) {
		/*
		Test06끝말잇기게임
		자바를 최초 제시어로 하는 끝말잇기 게임을 구현

		게임오버 조건은 다음과 같습니다.
		이전 단어와 이어지지 않는 단어를 입력한 경우
		한글 2~6글자가 아닌 단어 입력(띄어쓰기 허용하지 않음)
		한 번이라도 입력한 적이 있는 단어를 또 입력한 경우
		*/
		
		String firstWord = "자바";
		List<String> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		a.add(firstWord);
		String currentWord = firstWord;
		while (true) {
            System.out.println("현재 단어: " + currentWord);
            String input = sc.next();

            // 1. 이전 단어와 이어지지 않는 단어를 입력한 경우
            if (!currentWord.endsWith(input.substring(0, 1))) {
                System.out.println("\n게임오버 - 이전 단어와 이어지지 않는 단어를 입력했습니다.");
                break;
            }

            // 2. 한글 2~6글자가 아닌 단어 입력(띄어쓰기 허용하지 않음)
            if (!input.matches("^[가-힣]{2,6}$")) {
                System.out.println("\n게임오버 - 한글 2~6글자가 아닌 단어를 입력했습니다.");
                break;
            }

            // 3. 한 번이라도 입력한 적이 있는 단어를 또 입력한 경우
            if (a.contains(input)) {
                System.out.println("\n게임오버 - 이미 입력한 단어를 다시 입력했습니다.");
                break;
            }

            // 모든 조건을 통과하면 현재 단어를 갱신하고 리스트에 추가
            currentWord = input;
            a.add(currentWord);
		}
		sc.close();
		
		System.out.println("<입력한 모든 단어들>");
		for (int i=0;i<a.size();i++) {
			String all = a.get(i);
			System.out.println("-"+all);
		}
	}

}
