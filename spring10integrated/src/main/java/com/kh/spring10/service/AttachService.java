package com.kh.spring10.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring10.dao.AttachDao;
import com.kh.spring10.dto.AttachDto;

@Service
public class AttachService {

	@Autowired
	private AttachDao attachDao;

	//파일저장 + DB저장
	public int save(MultipartFile attach) throws IllegalStateException, IOException {
		int attachNo = attachDao.getSequence();//시퀀스생성
		File dir = new File(System.getProperty("user.home"), "upload");
		File target = new File(dir, String.valueOf(attachNo));
		attach.transferTo(target);//실물파일저장

		AttachDto attachDto = new AttachDto();
		attachDto.setAttachNo(attachNo);
		attachDto.setAttachName(attach.getOriginalFilename());
		attachDto.setAttachType(attach.getContentType());
		attachDto.setAttachSize(attach.getSize());
		attachDao.insert(attachDto);//DB저장

		return attachNo;
	}
	
	//파일 삭제 + DB삭제
	public void remove(int attachNo) {
		//실제파일삭제
		File dir = new File(System.getProperty("user.home"),"upload");
		File targer = new File(dir, String.valueOf(attachNo));
		targer.delete();//실제파일 삭제
		attachDao.delete(attachNo);//DB에서 삭제 
	}

}