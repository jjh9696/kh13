package condition2;

import java.util.Scanner;

public class Test05시간출력풀이 {

	public static void main(String[] args) {
/*		SNS에서는 작성한 글이 몇 초 전에 작성되었는지에 따라 다음과 같이 출력하도록 구성되어 있습니다.
		사용자가 초를 입력하면 입력된 값에 따라 시간 정보를 출력해보세요
		
		방금 전 - 작성한 지 10초가 되지 않은 글
		?초 전 - 작성한 지 10초 이상 1분이 되지 않은 글
		?분 전 - 작성한 지 1분 이상 1시간 미만인 글
		?시간 전 - 작성한지 1시간 이상 1일 미만인 글
		?일 전 - 작성한 지 1일 이상인 글
 * 
 */
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		int writeTime = sc.nextInt();
		
		String status;
		
		//계산
		if(writeTime < 10) {
			status = "방금 전";
		}
		else if(writeTime < 60) {// && writeTime>=10	//의미없는 계산 제거
			status = writeTime+"초 전";
		}
		else if(writeTime < 60*60) {// && writeTime>=60	//의미없는 계산 제거
			status = writeTime/60+"분 전";
		}
		else if(writeTime < 60*60*24) {// && writeTime>=60*60	//의미없는 계산 제거
			status = writeTime/60/60+"시간 전";
		}
		else {
			status = writeTime/60/60/24+"일 전";
		}
		
		//출력
		System.out.println(status+"에 작성");
	}

}
