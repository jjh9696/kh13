package oop.poly2_풀이_다형성없이;

public class Test01다형성안쓸때 {
	public static void main(String[] args) {
		int type = 1;
		int action = 3;

		if(type == 1) {//갤럭시북 생성
			GalaxyBook notebook = new GalaxyBook();
			if(action == 1) {
				notebook.power();
			}
			else if(action == 2) {
				notebook.video();
			}
			else {//action == 3
				notebook.typing();
			}
		}
		else {//type == 2//맥북 생성
			MacBook notebook = new MacBook();
			if(action == 1) {
				notebook.power();
			}
			else if(action == 2) {
				notebook.video();
			}
			else {//action == 3
				notebook.typing();
			}
		}
	}
}