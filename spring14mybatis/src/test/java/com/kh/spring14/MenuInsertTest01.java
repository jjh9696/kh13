package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.MenuDao;
import com.kh.spring14.dto.MenuDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MenuInsertTest01 {

	@Autowired
	private MenuDao menuDao;
	
	@Test
	public void test() {
		MenuDto menuDto = new MenuDto();
		
		menuDto.setMenuNameKor("요오리");
		menuDto.setMenuNameEng("foood");
		menuDto.setMenuType("food");
		menuDto.setMenuPrice(7000);
		
		menuDao.insert(menuDto);
		log.debug("등록완료");
	}
}
