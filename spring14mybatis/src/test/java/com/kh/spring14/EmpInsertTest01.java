package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpInsertTest01 {

	@Autowired
	private EmpDao empDao;
	
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		
		empDto.setEmpName("헬형우");
		empDto.setEmpDept("지옥");
		empDto.setEmpDate("1996-10-25");
		empDto.setEmpSal(500);
		
		empDao.insert(empDto);
		log.debug("등록완료");
	}
}
