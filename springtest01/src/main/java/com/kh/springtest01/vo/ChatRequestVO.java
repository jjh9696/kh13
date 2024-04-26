package com.kh.springtest01.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//클라이언트가 보내는 메세지
@JsonIgnoreProperties(ignoreUnknown= true)
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ChatRequestVO {
	private String content;//채팅내용
}
