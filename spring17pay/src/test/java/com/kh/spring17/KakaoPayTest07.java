package com.kh.spring17;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayCancelRequestVO;
import com.kh.spring17.vo.KakaoPayCancelResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class KakaoPayTest07 {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Test
	public void test() throws URISyntaxException {
		
		//취소 테스트
		KakaoPayCancelRequestVO requestVO = 
				KakaoPayCancelRequestVO.builder()
					.tid("T60fa7a265886da9a467")
					.cancelAmount(100)
				.build();
		
		//처리
		KakaoPayCancelResponseVO responseVO = 
				kakaoPayService.cancel(requestVO);
		
		//결과 출력
		log.debug("responseVO = {}", responseVO);
	}
}