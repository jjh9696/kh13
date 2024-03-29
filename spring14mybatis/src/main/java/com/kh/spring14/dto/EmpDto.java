package com.kh.spring14.dto;

import com.kh.spring14.dto.EmpDto;

import lombok.Data;

@Data
public class EmpDto {
	private int empNo;
	private String empName;
	private String empDept;
	private String empDate;
	private int empSal;
}
