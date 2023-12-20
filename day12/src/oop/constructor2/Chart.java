package oop.constructor2;

public class Chart {

	private String title;
	private String singer;
	private long play;
	private int thumbsUp;
	
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setPlay(long play) {
		if(play>=0) {//재생수는 0이상
		this.play = play;
		}
	}
	void setThumbsUp(int thumbsUp) {
		if(thumbsUp>=0) {//좋아요는 0이상
		this.thumbsUp = thumbsUp;
		}
	}
	
	String getTitle() {
		return this.title;
	}
	String getSinger() {
		return this.singer;
	}
	long getPlay() {
		return this.play;
	}
	int getThumbsUp() {
		return this.thumbsUp;
	}
	boolean getBest() {//재생 10만 이상은 true
		return this.play>=100000;
	}
	boolean getPop() {//좋아요 10만 이상은 true
		return this.thumbsUp>=100000;
	}
	long getRankPoint() { // 랭킹점수 = 재생수 * 2 + 좋아요수 / 2
		return (this.play*2)+(this.thumbsUp/2);
	}
	
	Chart (String title,String singer){
		this(title,singer,0,0);
	}
	Chart (String title,String singer,long play,int thumbsUp){
		this.setTitle(title);
		this.setSinger(singer);
		this.setPlay(play);
		this.setThumbsUp(thumbsUp);
	}
	
	void information() {
		
		if(getBest()&&getPop()) {
			System.out.println("제목 : "+getTitle()+"(베스트)(인기곡)");
		}
		else if (getBest()) {
			System.out.println("제목 : "+getTitle()+"(베스트)");
		}
		else if (getPop()) {
			System.out.println("제목 : "+getTitle()+"(인기곡)");
		}
		else {
			System.out.println("제목 : "+getTitle());
		}
		System.out.println("가수 : "+getSinger());
		System.out.println("재생 수 : "+getPlay());
		System.out.println("좋아요 수 : "+getThumbsUp());
		System.out.println("랭킹점수 : "+getRankPoint());
		
		System.out.println();
	}
	
}
