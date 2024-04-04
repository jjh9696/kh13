package com.kh.spring17;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayApproveRequestVO;
import com.kh.spring17.vo.KakaoPayApproveResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class KakaoPayTest06 {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Test
	public void test() throws URISyntaxException {
		
		//데이터 준비 - KakaoPayApproveRequestVO
		KakaoPayApproveRequestVO requestVO = 
				KakaoPayApproveRequestVO.builder()
					.tid("T60e32c64510678bc609")
					.partnerOrderId("a326f704-93ac-4e85-9295-10d76ccb0c50")
					.partnerUserId("testuser1")
					.pgToken("9edf6cc7131814e60223")
				.build();
		
		//처리
		KakaoPayApproveResponseVO responseVO = 
				kakaoPayService.approve(requestVO);
		
		//결과 출력 - KakaoPayApproveResponseVO
		log.debug("responseVO = {}", responseVO);
	}
}