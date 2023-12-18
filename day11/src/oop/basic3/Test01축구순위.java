package oop.basic3;

public class Test01축구순위 {

	public static void main(String[] args) {

		UKTeam a = new UKTeam();
		a.rank = 1;
		a.name = "아스널";
		a.win = 12;
		a.draw = 3;
		a.lose = 2;
		
		UKTeam b = new UKTeam();
		b.rank = 2;
		b.name = "리버풀"; 
		b.win = 11;
		b.draw = 5;
		b.lose = 1;
		
		UKTeam c = new UKTeam();
		c.rank = 3;
		c.name = "애스턴 빌라";
		c.win = 12;
		c.draw = 2;
		c.lose = 3;
		
		UKTeam d = new UKTeam();
		d.rank = 4;
		d.name = "맨 시티";
		d.win = 10;
		d.draw = 4;
		d.lose = 3;
		
		System.out.println("<영국 축구 순위>");
		System.out.print("순위 : "+a.rank);
		System.out.println(", 클럽명 : "+a.name);
		System.out.print("\t 승리 : "+a.win);
		System.out.print(", 무승부 : "+a.draw);
		System.out.print(", 패배 : "+a.lose);
		System.out.println("\n");
		
		System.out.print("순위 : "+b.rank);
		System.out.println(", 클럽명 : "+b.name);
		System.out.print("\t  승리 : "+b.win);
		System.out.print(", 무승부 : "+b.draw);
		System.out.print(", 패배 : "+b.lose);
		System.out.println("\n");
		
		System.out.print("순위 : "+c.rank);
		System.out.println(", 클럽명 : "+c.name);
		System.out.print("\t 승리 : "+c.win);
		System.out.print(", 무승부 : "+c.draw);
		System.out.print(", 패배 : "+c.lose);
		System.out.println("\n");
		
		System.out.print("순위 : "+d.rank);
		System.out.println(", 클럽명 : "+d.name);
		System.out.print("\t 승리 : "+d.win);
		System.out.print(", 무승부 : "+d.draw);
		System.out.print(", 패배 : "+d.lose);
		
		
		
	}

}
