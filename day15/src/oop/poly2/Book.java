package oop.poly2;

public abstract class Book {
	/*
	개발을 하기 위해 노트북을 구매하려고 합니다.
	노트북 매장에 가보니 노트북이 두 종류가 있습니다.
	맥북(MacBook)
	갤럭시북(GalaxyBook)

	어떤걸 사야될지 몰라서 다음 기능들을 테스트해보려고 합니다.
	전원 기능(power)
	동영상 재생 기능(video)
	타이핑 기능(typing)

	사용자에게 테스트하고 싶은 노트북을 선택하게 하고, 
	테스트하고 싶은 기능을 선택하도록 하여 해당 기능을 실행해주는 프로그램을 구현하세요

	(예시)
	노트북을 먼저 선택하세요
	1.맥북   2.갤럭시북 : 1

	테스트할 기능을 선택하세요
	1.전원  2.동영상재생 3.타이핑 : 2

	맥북으로 동영상을 재생합니다
	*/
	public abstract void power();
	public abstract void video();
	public abstract void typing();
	
	
}
