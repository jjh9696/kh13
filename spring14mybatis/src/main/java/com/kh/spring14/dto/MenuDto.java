package com.kh.spring14.dto;

import com.kh.spring14.dto.MenuDto;

import lombok.Data;

@Data
public class MenuDto {
	private int menuNo;
	private String menuNameKor;
	private String menuNameEng;
	private String menuType;
	private int menuPrice;
}
