package api.lang.object;

public class Test01Object클래스 {

	public static void main(String[] args) {
//		Object 클래스
//		"객체"를 의미하는 추상적인 클래스(추상 클래스는 아님)
//		모든 클래스의 시조(최상위 클래스)
//		"객체"가 가져야 하는 기본 속성애 대해서 정리
		
		
		//객체 생성
		
		Object a  = new Object();
		Object b  = new Object();
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.hashCode());//객체의 일렵번호 반환 (주소아님)
		System.out.println(b.hashCode());
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		
	}

}
