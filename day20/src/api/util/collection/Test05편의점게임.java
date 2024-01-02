package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05편의점게임 {

	public static void main(String[] args) {
		/*
		Test05편의점게임
		편의점게임은 다음과 같이 진행합니다.
		사용자에게 편의점에 가면~ 출력
		사용자가 편의점에 있을법한 물건을 입력
		한 번이라도 입력한 적이 있는 물건이면 게임오버
		입력한 적이 없는 물건이면 등록 후 1번부터 진행
		게임 오버가 되면 여태까지 입력된 물건들을 모두 출력

		편의점에가면~ (핫도그)
		편의점에가면~ (김밥)
		편의점에가면~ (라면)
		편의점에가면~ (핫도그)
		게임 오버!
		<입력한 물건들>
		- 핫도그
		- 김밥
		- 라면
		*/
		
		Scanner sc = new Scanner(System.in);
		List<String> a = new ArrayList<>();
		
		while(true) {
			System.out.print("편의점에 가면~ ");
			String input = sc.next();
			if(!a.contains(input)) {
				System.out.println(input+"도 있고~ \n");
				 a.add(input);
			}
			else {
				System.out.println("\n게임오버");
				System.out.println("입력한 것들");
				for(int i = 0;i<a.size();i++) {
					System.out.println("-"+a.get(i));
				}
				break;
			}
		}
		sc.close();
	}

}
