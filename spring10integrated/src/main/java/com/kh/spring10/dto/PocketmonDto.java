package com.kh.spring10.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data //한 번에 설정
//@Setter @Getter @NoArgsConstructor @ToString
public class PocketmonDto {
	private int pocketmonNo;
	private String pocketmonName;
	private String pocketmonType;
}
