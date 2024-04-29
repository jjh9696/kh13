package com.kh.springtest01.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ChatbotDto {
	private int chatbotNo;
	private String chatbotQuestion;
	private String chatbotAnswer;

}

