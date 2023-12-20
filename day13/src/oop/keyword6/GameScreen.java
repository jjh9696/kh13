package oop.keyword6;

public class GameScreen {
	
	/*
	 * 요구사항 게임 화면(GameScreen) 을 생성하려고 합니다. 게임 화면을 만들 때는 폭(width)과 높이(height),
	 * 제목(title)이 필요합니다. 게임 화면 생성 시 폭과 높이를 지정할 수 있습니다. 게임 화면의 폭과 높이가 한 번 정해지면 이를 바꿀
	 * 수 없습니다. 게임 화면의 제목은 언제든지 변경이 가능합니다. 사용자에게 크기와 제목을 입력받아 게임화면 객체를 생성한 뒤 정보를
	 * 출력해보세요 정보 출력 시 폭과 높이를 이용하여 해상도(resolution)를 출력하세요
	 */	 
	
	private final int width ;
	private final int height ;
	private String title;
	
	public GameScreen(int width,int height,String title) {
		this.width=width;
		this.height=height;
		this.setTitle(title);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
//	public static String resolution(int width,int height) {
//		return "해상도 : "+width+"x"+height;
//	}
	public String getResolution() {
		return width*height+"("+width+"x"+height+")";
	}
	void information () {
		System.out.println("제목 : "+this.getTitle());
		System.out.println("폭 : "+this.getWidth());
		System.out.println("높이 : "+this.getHeight());
		System.out.println("해상도 : "+getResolution());
	}
}
