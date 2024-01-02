package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07List도우미 {

	public static void main(String[] args) {

		//List를 도와주는 클래스
		//-Collections 클래스(뒤에 s가 붙은 클래스는 도우미 클래스)
		//-List의 순서 활용을 극대화
		//-같은 종류의 데이터가 아주 많을 때 쓰는 도구
		
		List<Integer>list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//뒤집기(reverse)
		Collections.reverse(list);
		System.out.println(list);
		
		//뒤섞기(suffle)
		Collections.shuffle(list);
		System.out.println(list);
		
		//정렬(sort)
		Collections.sort(list);
//		list.sort(null);
		System.out.println(list);
		
		
	}

}
