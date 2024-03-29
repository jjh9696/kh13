package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpUpdateTest01 {

	@Autowired
	private EmpDao empDao;
	
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		empDto.setEmpNo(50);
		empDto.setEmpName("햄버거왕");
		empDto.setEmpDept("햄버거전략사업본부");
		empDto.setEmpDate("2024-02-03");
		empDto.setEmpSal(8500);
		
		if(empDao.update(empDto)) {
			log.debug("정보 변경 성공");			
		}
		else {
			log.debug("존재하지 않는 대상");
		}
	}
}
