package api.lang.string;

public class Test04문자열검사 {

	public static void main(String[] args) {

		String url = "http://www.naver.com";
		
		//홈페이지 주소인가? (http로 시작하는가)
		System.out.println("http로 시작? "+url.startsWith("http")); //true
		System.out.println("https로 시작? "+url.startsWith("https")); //false
		
		// .com으로 끝나는가?
		System.out.println(".com으로 종료? "+url.endsWith(".com")); //true
		
		//네이버 주소인가? (naver가 들어있는가?) 위치, 개수 상관x
		System.out.println("naver 포함? "+url.contains("naver")); //true
		
		//네이버가 어디있어요?
		System.out.println("naver 위치 = "+url.indexOf("naver")); // 11
		System.out.println("kakao 위치 = "+url.indexOf("kakao")); // -1 (위치가 -1 == 없다)
		
		System.out.println("글자수 = "+url.length()); //띄어쓰기, 엔터도 한 글자로 취급
		
		//특정 위치의 글자를 추출
		char ch = url.charAt(11);//.charAt() 의 반환형은 char
		System.out.println("+11위치의 글자 = "+ch); //n
	}
}
