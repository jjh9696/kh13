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
					.tid("T616afe54510678be1d9")
					.partnerOrderId("1cf729c7-840c-49c3-ab10-117a34317e18")
					.partnerUserId("testuser1")
					.pgToken("7a3d36d7b12488c7cc4e")
				.build();
		
		//처리
		KakaoPayApproveResponseVO responseVO = 
				kakaoPayService.approve(requestVO);
		
		//결과 출력 - KakaoPayApproveResponseVO
		log.debug("responseVO = {}", responseVO);
	}
}