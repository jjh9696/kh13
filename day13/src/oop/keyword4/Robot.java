package oop.keyword4;

public class Robot {

	public static double square(double side) {
		return side*side;
	}
	
	public static double triangle(double width, double height) {
		return width*height/2;
	}
	
	public static double circle(double radius) {
//		return 3.14*radius*radius; 위에서 만든거 가져오기 가능
		return square(radius)*3.14;
	}
	
	public static int subway(int year) {
		int money;
		int age=2023-year+1;
		if (age<65&&age>=20) return money=1400;
		else if (age>=14) return money=800;
		else if (age>=8) return money=500;
		else return money=0;
	}
	
	public static boolean leap(int year) {
//		if ((year%4==0&&year % 100 != 0)||year % 400 == 0) return true;
//		return false;
		return (year%4==0&&year % 100 != 0)||year % 400 == 0;
	}
	
	public static double bmi(double cm,double kg) {
		 double m=cm/100;
		 return kg / (m*m);
	}
	
}
