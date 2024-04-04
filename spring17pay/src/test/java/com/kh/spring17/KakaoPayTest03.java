package com.kh.spring17;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class KakaoPayTest03 {

	@Test
	public void test( ) throws URISyntaxException, JsonProcessingException {
		//카카오페이 서버에 결제 준비(ready) 요청을 보내보자!
		//신버전 코드(카카오페이 개발자센터가 따로 생김)
		
		//요청 전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		//주소 생성
		URI uri = new URI("https://open-api.kakaopay.com/online/v1/payment/approve");
		
		//헤더 생성
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "SECRET_KEY DEV4CAB7C0B9E2B8730344431830978BE4462557");
		header.add("Content-Type", "application/json");
		
		//바디 생성
//		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		Map<String, String> body = new HashMap<>();
		body.put("cid", "TC0ONETIME");
		body.put("tid", "T60e04614510678bc537");
		body.put("pg_token", "b672cb0753b3a2b12462");
		body.put("partner_order_id", "a2d41a23-18d9-43fc-8db4-6a7d0b61512d");
		body.put("partner_user_id", "testuser1");
		
		//통신 요청
//		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(body,header);//경고를 없애려면 이렇게 써야함 안쓸수 있다면 안쓰기		
		HttpEntity entity = new HttpEntity(body, header);//헤더+바디
		
		Map response = template.postForObject(uri, entity, Map.class);
		//log.debug("response = {}", response);
		
		log.debug("partner_order_id={}", body.get("partner_order_id"));
		log.debug("partner_user_id={}", body.get("partner_user_id"));
		log.debug("거래번호(tid)={}", response.get("tid"));
		log.debug("주소 = {}", response.get("next_redirect_pc_url"));
	}
	
}