package api.lang.string3;

public class Test02문자열버퍼 {

	public static void main(String[] args) {

		//StringBuffer를 이용한 문자열 합산
		
		
//		String star="";
		StringBuffer buffer = new StringBuffer();
		long begin = System.currentTimeMillis();//현재 시간을 밀리초(ms)로 반환
		for(int i =1;i<=10000;i++) {
//			star += "*";
			buffer.append("*");
		}
		long end = System.currentTimeMillis();
		long gap = end - begin;
//		System.out.println(star);
		System.out.println("gap = "+ gap);
		
	}

}
