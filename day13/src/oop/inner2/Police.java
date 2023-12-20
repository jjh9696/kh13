package oop.inner2;

public class Police {

	private String name, level;
	private Gun gun;
	
	public Police(String name, String level) {
		this.setName(name);
		this.setLevel(level);
		Gun gun = new Gun();
		this.setGun(gun);
//		this.setGun(new Gun()); 이거도 가능하긴함
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	private Gun getGun() {
		return gun;
	}

	private void setGun(Gun gun) {
		this.gun = gun;
	}

	//중첩 클래스(inner class, nested class)
	//-특정 클래스에 "소속"된 클래스
	private class Gun{
		//필드+메소드+생성자+클래스 도 만들 수 있긴함(잘안씀)
	}
}
