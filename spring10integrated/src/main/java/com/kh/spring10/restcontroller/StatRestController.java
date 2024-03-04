package com.kh.spring10.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dao.Menudao;
import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.vo.StatVO;

//통계데이터를 클라이언트에게 전송하는 컨트롤러
@CrossOrigin//CORS 허용
@RestController
@RequestMapping("/rest/stat")
public class StatRestController {

	@Autowired
	private PocketmonDao pocketmonDao;
	@Autowired
	private EmpDao empDao;
	@Autowired
	private Menudao menuDao;
	@Autowired
    private MemberDao memberDao;
	
	@RequestMapping("/pocketmon")
	public List<StatVO> pocketmon(){//자료형은 지금 포켓몬스터 통계목록/pocketmon()->뭘 받아올 필요가 없는 상황
		return pocketmonDao.statByType();//화면이 없으니깐 그냥 부르면 가져가세요! 느낌
	}
	@RequestMapping("/emp")
	public List<StatVO> emp(){
		return empDao.statByDept();
	}
	@RequestMapping("/menu")
	public List<StatVO> menu(){
		return menuDao.statByType();
	}
	@RequestMapping("/member")
    public List<StatVO> member(){
        return memberDao.statByLevel();
    }
}
