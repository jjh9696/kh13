package api.util.collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Test03로또추첨기 {

	public static void main(String[] args) {
		
//		Test03로또추첨기
//		ArrayList를 만들어 이번 주 예상 로또 번호 6개를 추첨하여 저장한 뒤 출력
//		(단, Random클래스를 사용하고, 중복된 번호는 추첨할 수 없다)
		
		Random r = new Random();
//		ArrayList<Integer> a = new ArrayList<>();
		TreeSet<Integer> a = new TreeSet<>(); //트리셋으로 만들면 오름차순 정렬을 해준다
		
		while(a.size()<6) {
			int num = r.nextInt(45) + 1;
			if(!a.contains(num)) {
				 a.add(num);
			}
		}
		
		System.out.println(a);
	}

}
