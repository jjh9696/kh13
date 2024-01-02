package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08사다리게임 {

	public static void main(String[] args) {
		/*
		Test08사다리게임
		네이버에서 사다리게임을 검색하여 나오는 프로그램을 인원수를 3명으로 고정 하고 푸세요
		(단, 애니메이션 부분은 제외합니다)

		다 푸신 분들은 인원수를 실제 프로그램과 동일하게 구현해보세요
		이동
		https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%
			EB%84%A4%EC%9D%B4%EB%B2%84+%EC%82%AC%EB%8B%A4%EB%A6%AC+%EA%B2%8C%EC%9E%84
		*/
		Scanner sc =new Scanner(System.in);
		List<String> a = new ArrayList<>();
		List<String> b = new ArrayList<>();
		
		System.out.print("인원수 입력 : ");
		int people = sc.nextInt();
		System.out.println(people+"명의 이름을 입력하세요");
		for(int i=0; i<people;i++) {
			System.out.print(i+1+"번째 이름 : ");
			a.add(sc.next());
		}
		System.out.println(people+"개의 결과를 입력하세요");
		for(int i=0; i<people;i++) {
			System.out.print(i+1+"번째 결과 : ");
			b.add(sc.next());
		}
		
		Collections.shuffle(b);
		
		System.out.println("\n<결과>");
        for (int i = 0; i < people; i++) {
            System.out.println(a.get(i) + " : " + b.get(i));
        }
		
	}

}
