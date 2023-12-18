package oop.method1;

public class UKTeam {
	
	//멤버변수 - 데이터
	int rank;
	String name;
	int win, draw, lose;
	
	//멤버 메소드 - 자주쓰는 코드
//	void 이름() {코드}
	
	void information() {
		System.out.print("순위 : "+this.rank);
		System.out.println(", 클럽명 : "+this.name);
		System.out.print("\t"+this.win+"승 "+this.draw+"무 "+this.lose+"패");
		System.out.println();
	}
	
	void data(int rank, String name, int win,int draw,int lose) {
		this.rank = rank;
		this.name=name;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}
	
}
