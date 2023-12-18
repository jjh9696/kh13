package oop.method1;

public class Test01메소드사용 {

	public static void main(String[] args) {

		//객체생성
		UKTeam a = new UKTeam();
		UKTeam b = new UKTeam();
		UKTeam c = new UKTeam();
		UKTeam d = new UKTeam();
		
		//초기화
		a.data(1,"아스널", 12, 3, 2);
		b.data(2, "리버풀", 11, 5, 1);
		c.data(3, "애스턴 빌라", 12, 2, 3);
		d.data(4, "맨 시티", 10, 4, 3);
		
		
		a.information();//a를 주인공으로 해서 information에 저장된 코드를 실행
		b.information();
		c.information();
		d.information();
		
	}

}
