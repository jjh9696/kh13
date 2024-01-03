package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02로그인프로그램 {

	public static void main(String[] args) {
		/*
		Map을 만들고 다음 아이디와 비밀번호를 저장해둔 뒤 사용자에게 아이디와 비밀번호를 입력받아 로그인을 판정하는 프로그램을 구현하세요

		(아이디) khadmin , (비밀번호) admin1234
		(아이디) khstudent, (비밀번호) student1234
		(아이디) khteacher, (비밀번호) teacher1234
		(아이디) khmanager, (비밀번호) manager1234

		사용자가 입력한 아이디와 비밀번호를 검사하여 통과 시 로그인 성공 출력
		통과하지 못할 경우 입력하신 정보가 일치하지 않습니다 출력 
		*/
		Scanner sc = new Scanner(System.in);
		Map<String, String> user = new HashMap<>();
		
		user.put("khadmin", "admin1234");
		user.put("khstudent", "student1234");
		user.put("khteacher", "teacher1234");
		user.put("khmanager", "manager1234");
		
		System.out.print("아이디를 입력하세요 : ");
		String idInput = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String pwInput = sc.nextLine();
		
		String pw = user.get(idInput);
		
		if(user.containsKey(idInput)&&pw.equals(pwInput)) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("입력하신 정보가 일치하지 않습니다.");
		}
		
	}

}
