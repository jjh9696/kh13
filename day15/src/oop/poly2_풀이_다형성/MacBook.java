package oop.poly2_풀이_다형성;

public class MacBook extends NoteBook {

	@Override
	public void power() {
		System.out.println("맥북의 전원 기능 실행");
	}

	@Override
	public void video() {
		System.out.println("맥북의 영상재생 기능 실행");
	}

	@Override
	public void typing() {
		System.out.println("맥북의 타이핑 기능 실행");
	}

}
