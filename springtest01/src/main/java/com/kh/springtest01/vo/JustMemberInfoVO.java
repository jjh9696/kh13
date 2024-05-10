package com.kh.springtest01.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//채팅 목록에 회원 아이디만 넘겨주기 위한 VO
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class JustMemberInfoVO {
	private String memberId;//회원아이디
	private String memberLevel;//회원아이디
}	
