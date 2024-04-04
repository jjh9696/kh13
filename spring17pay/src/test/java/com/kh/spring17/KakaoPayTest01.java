package com.kh.spring17;

import java.net.URI;
import java.net.URISyntaxException;
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
public class KakaoPayTest01 {

	@Test
	public void test( ) throws URISyntaxException, JsonProcessingException {
		//카카오페이 서버에 결제 준비(ready) 요청을 보내보자!
		//구버전 코드
		
		//요청 전송 도구 생성
		RestTemplate template = new RestTemplate();

		//주소 생성
//		URI uri = new URI("https://open-api.kakaopay.com/online/v1/payment/ready");
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");

		//헤더 생성
		HttpHeaders header = new HttpHeaders();
//		header.add("Authorization", "SECRET_KEY e1ef2662f8895554929b0db0a52e7891");
//		header.add("Content-Type", "application/json");
		header.add("Authorization", "KakaoAK e1ef2662f8895554929b0db0a52e7891");
		header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

		//바디 생성
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME");
		body.add("partner_order_id", UUID.randomUUID().toString());
		body.add("partner_user_id", "testuser1");
		body.add("item_name", "초코파이 외 1개");
		body.add("quantity", "1");
		body.add("total_amount", "4500");
		body.add("tax_free_amount", "0");
		body.add("approval_url", "http://localhost:8080/success");
		body.add("cancel_url", "http://localhost:8080/cancel");
		body.add("fail_url", "http://localhost:8080/fail");
		
		//통신 요청
//		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(body,header);//경고를 없애려면 이렇게 써야함 안쓸수 있다면 안쓰기
		HttpEntity entity = new HttpEntity(body,header);//헤더 + 바디
		
		Map response = template.postForObject(uri, entity, Map.class);
//		log.debug("response = {}", response);
		log.debug("주소 = {}", response.get("next_redirect_pc_url"));
		
	}
}
