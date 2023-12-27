package api.lang.string;

public class Test07욕설필터링풀이3 {
	public static void main(String[] args) {

		//단어의 글자수를 지켜가면서 마스킹 처리하도록 업그레이드 해보자
		String[] words = new String[] {
			"수박", "조카", "시베리아", "개나리", "신발끈", 
			"지옥", "주옥", "십장생", "십자수", "게불"
		}; 

		String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";


		for(int i=0; i < words.length; i++) {
			int size = words[i].length();//글자수 확인

			//합계를 구하는 것처럼 문자열을 계속 더하여 별을 생성(버전무관)
			String star = "";
			for(int k=1; k <= size; k++) {
				star += "*";
			}

			input = input.replace(words[i], star);
		}

		System.out.println(input);

	}
}
