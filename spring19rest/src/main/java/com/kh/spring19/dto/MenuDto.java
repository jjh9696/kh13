package com.kh.spring19.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Tag(name = "메뉴 정보 객체")
@Schema(description = "메뉴 정보 객체")//springdoc에 추가되는 설명
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class MenuDto {
	private int menuNo, menuPrice;
	private String menuNameKor, menuNameEng, menuType;
}
