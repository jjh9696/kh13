package oop.constructor3;

public class Game {
	/*
	게임 캐릭터 정보를 사용자에게 입력받아 캐릭터를 생성하는 프로그램을 구현하세요

	캐릭터에는 아이디, 직업, 레벨, 소지금 정보가 저장되어야 합니다.
	사용자에게 아이디와 직업을 입력받습니다.
	직업은 전사, 도적, 마법사 중에서만 설정 가능합니다.
	레벨은 자동으로 1로 설정됩니다.
	소지금은 캐릭터 생성 시 100 gold로 설정됩니다.
	캐릭터 생성 후 정보를 출력해보세요
	*/
	
	private String id;
	private String job;
	private int level;
	private int gold;
	
	Game(String id,String job){
//		this(id,job,1,100);
		this.setId(id);
		this.setJob(job);
		this.setLevel(1);
		this.setGold(100);
	}
//	Game(String id,String job,int level,int gold){
//		this.setId(id);
//		this.setJob(job);
//		this.setLevel(level);
//		this.setGold(gold);
//	}
	
	void setId(String id) {
		this.id = id;
	}
	void setJob(String job) {
//		if(job=="전사"||job=="도적"||job=="마법사") {}//안되는코드
		switch (job) {
		case "전사":
		case "도적":	
		case "마법사":
			this.job = job;
		}
	}
	void setLevel(int level) {
		if(level<1)return;
		this.level = level;
	}
	void setGold(int gold) {
		if(gold<0)return;
		this.gold = gold;
	}
	
	String getId() {
		return id;
	}
	String getJob() {
		return job;
	}
	int getLevel() {
		return level;
	}
	int getGold() {
		return gold;
	}
	
	void information () {
		System.out.println("아이디 : "+this.getId());
		System.out.println("직업 : "+this.getJob());
		System.out.println("레벨 : "+this.getLevel());
		System.out.println("소지금 : "+this.getGold());
		System.out.println();
	}
	
	void levelUp() {
		this.level++;
	}
	
	
}
