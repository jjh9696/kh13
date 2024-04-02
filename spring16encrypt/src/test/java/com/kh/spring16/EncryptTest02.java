package com.kh.spring16;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EncryptTest02 {

	@Test
	public void test() {
		String origin = "hello world";
		int offset = 3; //변조값
		
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i < origin.length(); i++) {
			char ch = origin.charAt(i);
			ch ^= offset;
			buffer.append(ch);
		}
		
		log.debug("원래 문자열 = {}", origin);
		log.debug("암호화 결과 = {}", buffer);
		
        StringBuffer decryptedBuffer = new StringBuffer();
        // 복호화
        for (int i = 0; i < buffer.length(); i++) {
            char ch = buffer.charAt(i);
            ch ^= offset;
            decryptedBuffer.append(ch);
        }
        String decrypted = decryptedBuffer.toString();
        log.debug("복호화 결과 = {}", decrypted);
		
	}
}
