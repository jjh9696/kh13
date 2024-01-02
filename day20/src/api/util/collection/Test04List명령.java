package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test04List명령 {

	public static void main(String[] args) {

		//List는 "순서"를 중요시 여긴다.
		//-순서와 관련된 명령들을 살펴본다.
		
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>(); //업캐스팅
		
		//데이터 추가
		list.add("피카츄");
		list.add("라이츄");
		list.add(1,"파이리");
		
		//데이터 추출 - .get()
		System.out.println(list.get(0));//+0지점 데이터 확인
		System.out.println(list.get(1));//+1지점 데이터 확인
		System.out.println(list.get(2));//+2지점 데이터 확인
		//System.out.println(list.get(3));//error
		
		for(int i=0;i<list.size();i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		
		//출력
		System.out.println(list);
		
	}

}
