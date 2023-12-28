package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05강제예외처리 {
	public static void main(String[] args) {
		
		
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("귤 개수 : ");
			int mandarin = sc.nextInt();//예외 발생 예상위치
			if(mandarin<0) {//귤 개수가 음수라면 문제가 된다(자바는 모르네?)
//				Exception ex = new Exception();
//				throw ex;
				throw new Exception(); 
			}
			System.out.print("인원 수 : ");
			int people = sc.nextInt();//예외 발생 예상위치
			if(people<0) {//인원 수가 음수라면 문제가 된다(자바는 모르네?)
				throw new Exception(); 
			}
			int dist = mandarin / people;//예외 발생 예상위치
			int rest = mandarin % people;
			
			System.out.println("한 사람 당 "+dist+"개 씩 줄 수 있습니다.");
			System.out.println("다 주면 "+rest+"개 남아요.");
		}
		catch(Exception e) {//Plan B
			System.err.println("입력이 잘못되었습니다.");
		}
	}
}
