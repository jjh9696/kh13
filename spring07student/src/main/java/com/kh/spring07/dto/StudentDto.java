package com.kh.spring07.dto;

public class StudentDto {

	private int studentId;
	private String name;
	private int koreanScore;
	private int mathScore;
	private int englishScore;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getTotal() {
		return koreanScore+mathScore+englishScore;
	}
	public float getAverage() {
		return getTotal() / 3f;
	}
	public StudentDto() {
		super();
	}
	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", name=" + name + ", koreanScore=" + koreanScore + ", mathScore="
				+ mathScore + ", englishScore=" + englishScore + "]";
	}
	
}
