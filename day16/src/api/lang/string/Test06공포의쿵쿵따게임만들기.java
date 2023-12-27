package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test06공포의쿵쿵따게임만들기 {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] startWords= {"바나나","프랑스","기차표","병아리","강아지"};
		
		String currentWord = startWords[r.nextInt(startWords.length)];
		
		System.out.println(currentWord+"! 쿵쿵따!");
		int round = 1;
		
		while(true) {
			String userWord = sc.nextLine();
			if (userWord.charAt(0)==currentWord.charAt(currentWord.length()-1)) {
				currentWord = userWord;
	            System.out.println(currentWord + "! 쿵쿵따!");
	            round++;
			}
			else {
				System.out.println("땡! 게임오버! 진행된 라운드 수 : "+round);
				break;
			}
			if (userWord.length()!=3||!userWord.matches("[가-힣]+")) {
				System.out.println("땡! 게임오버! 진행된 라운드 수 : "+round);
				break;
			}
		}
	}
}
