package oop.poly2;

import java.util.Scanner;

import oop.poly1.IPhone;

public class Test01다형성 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book laptop;
		System.out.println("노트북선택(1.맥북/2.갤럭시북)");
		int number1 = sc.nextInt();
		if (number1==1) {
			laptop = new MacBook();
			System.out.println("기능선택(1.전원/2.비디오/3.타이핑)");
			int number2 = sc.nextInt();
			if(number2==1) {
				laptop.power();
			}
			else if(number2==2) {
				laptop.video();
			}
			else if(number2==3) {
				laptop.typing();
			}
			else {
				System.out.println("잘못입력");
			}
		}
		else if (number1==2) {
			laptop = new GalaxyBook();
			System.out.println("기능선택(1.전원/2.비디오/3.타이핑)");
			int number2 = sc.nextInt();
			if(number2==1) {
				laptop.power();
			}
			else if(number2==2) {
				laptop.video();
			}
			else if(number2==3) {
				laptop.typing();
			}
			else {
				System.out.println("잘못입력");
			}
		}
		else {
			System.out.println("잘못입력");
		}
	}

}
