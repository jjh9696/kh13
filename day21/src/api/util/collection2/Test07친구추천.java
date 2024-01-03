package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test07친구추천 {

	public static void main(String[] args) {
		/*
		SNS에서 포켓몬스터 친구들은 다음과 같은 팔로우 관계를 가지고 있습니다.

		피카츄 - 라이츄, 꼬부기
		라이츄 - 피카츄, 파이리, 꼬부기
		파이리 - 피카츄, 라이츄, 꼬부기
		꼬부기 - 피카츄, 라이츄, 파이리

		신규 기능으로 친구 추천기능을 만들려고 합니다. 친구 추천 기능은 내 친구들이 공통으로 알고 있는 친구라면 내 친구일 확률이 높다는 것을 프로그래밍으로 구현한 것입니다.

		이 기능을 피카츄에게 적용했을 때 피카츄에게 표시되는 추천 친구 목록을 화면에 출력하세요.
		*/
		Set<String> Pikachu = Set.of("라이츄", "꼬부기");
		Set<String> Raichu = Set.of("피카츄", "파이리", "꼬부기");
		Set<String> Charmander = Set.of("피카츄", "라이츄", "꼬부기");
		Set<String> Squirtle = Set.of("피카츄", "라이츄", "파이리");
		
		Set<String> friendsRnS = new TreeSet<String>();
		friendsRnS.addAll(Raichu);
		friendsRnS.retainAll(Squirtle);

		Set<String> friendsRecommend = new TreeSet<String>();
		friendsRecommend.addAll(friendsRnS);
		friendsRecommend.remove("피카츄");
		
		System.out.println("<추천 친구 목록>");
		for(String check : friendsRecommend) {
			System.out.println("- "+check);
		}
		
	}

}
