package com.kh.spring17.vo;

public class KakaoPayCardInfoVO {
	private String kakaopayPurchaseCorp;//카카오페이 매입사명
	private String kakaopayPurchaseCorpCode;//카카오페이 매입사 코드
	private String kakaopayIssurCorp;//카카오페이 발급사명
	private String kakaopayIssurCorpCode;//카카오페이 발급사 코드
	private String bin;//카드 BIN
	private String cardType;//카드 유형
	private String installMonth;//할부 개월 수 
	private String approvedId;//카드사 승인번
	private String cardMid;//카드사 가맹점 번호
	private String interestFreeInstall;//무이자할수 여부(Y/N)
	private String installmentType;//할부유형(2024/02/01~)
	private String cardItemCode;//카드 상품 코드
	
}
