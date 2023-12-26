package api.lang.string;

public class Test01객체생성문제 {
    public static void main(String[] args) {
        // a라는 이름으로 비어 있는 객체 생성
        StringBuffer a = new StringBuffer();

        // b라는 이름으로 hello라는 글자를 저장한 객체 생성
        StringBuffer b = new StringBuffer("hello");

        // a와 b의 요약 정보 출력
//        System.out.println("a의 요약 정보: " + a.toString());
//        System.out.println("b의 요약 정보: " + b.toString());
        System.out.println("a의 요약 정보: " + a);//생략해도 출력 시 동일한 효과
        System.out.println("b의 요약 정보: " + b);//생략해도 출력 시 동일한 효과

        // a와 b의 보관 중인 글자수를 각각 출력
        System.out.println("a의 글자 수: " + a.length());
        System.out.println("b의 글자 수: " + b.length());

        // a와 b에 각각 java라는 글자를 추가
        a.append("java");
        b.append("java");

        // a와 b의 요약 정보와 보관 중인 글자 수를 다시 출력
        System.out.println("a의 요약 정보: " + a.toString());
        System.out.println("b의 요약 정보: " + b.toString());
        System.out.println("a의 글자 수: " + a.length());
        System.out.println("b의 글자 수: " + b.length());
    }

}