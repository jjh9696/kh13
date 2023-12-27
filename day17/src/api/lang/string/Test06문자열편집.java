package api.lang.string;

public class Test06문자열편집 {

	public static void main(String[] args) {

		//문자열은 불변(immutable)이다.
		//편집 명령을 쓰면 무조건 신규 문자열이 나온다
		
		String word = "Hello Java!";
		//word.toUpperCase();
		//System.out.println("대문자 = "+word); //이미 만들어진 문자열이여서 Hello Java! 그대로 나온다
		
		String upper = word.toUpperCase();
		System.out.println("대문자 = "+upper); //대문자 = HELLO JAVA!
		System.out.println("소문자 = "+word.toLowerCase()); //소문자 = hello java!
		
		//자르기 - substring()
		System.out.println("자르기 = "+word.substring(0, 4));//0부터 4까지 자르기 (4포함x) //자르기 = Hell
		System.out.println("자르기 = "+word.substring(6));//6이후 자르기 (6부터 끝까지) //자르기 = Java!
		
		//불필요한 공백제거 - trim(), strip()
		String url = "        　      www.naver.com             ";//ㄱ한자1(공백)이 숨겨져있다 
		System.out.println("여백제거 = "+url.trim());//아스키코드만 제거(구식명령)//여백제거 = 　      www.naver.com
		System.out.println("여백제거 = "+url.strip());//유니코드도 제거(최신명령)//여백제거 = www.naver.com
		
		//문자열 치환(찾아 바꾸기) - replace()
		String text = "나는 피자가 좋아요";
		System.out.println("치환 = " + text.replace("피자", "자바"));
		
		//문자열 분리 - split()
		String[] parts = text.split(" ");
		for(int i=0;i<parts.length;i++) {
			System.out.println("분리 = "+parts[i]);
		}
		
		
		
	}
}
