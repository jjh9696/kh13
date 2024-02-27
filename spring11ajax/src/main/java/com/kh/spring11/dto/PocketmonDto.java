package com.kh.spring11.dto;

public class PocketmonDto {
	private int pocketmonNo;
	private String pocketmonName;
	private String pocketmonType;
	public int getPocketmonNo() {
		return pocketmonNo;
	}
	public void setPocketmonNo(int pocketmonNo) {
		this.pocketmonNo = pocketmonNo;
	}
	public String getPocketmonName() {
		return pocketmonName;
	}
	public void setPocketmonName(String pocketmonName) {
		this.pocketmonName = pocketmonName;
	}
	public String getPocketmonType() {
		return pocketmonType;
	}
	public void setPocketmonType(String pocketmonType) {
		this.pocketmonType = pocketmonType;
	}
	public PocketmonDto() {
		super();
	}
	@Override
	public String toString() {
		return "포켓몬 번호=" + pocketmonNo + ", 포켓몬 이름=" + pocketmonName + ", 포켓몬 타입="
				+ pocketmonType + "]";
	}
	
	
	
}
