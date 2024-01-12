package jdbc.app;

import java.util.List;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test13메뉴목록 {

	public static void main(String[] args) {

		MenuDao dao = new MenuDao();
		List<MenuDto> list = dao.selectlist();
		
		for(MenuDto menuDto : list) {
			System.out.println(menuDto.getMenuNameKor()+"("+menuDto.getMenuPrice()+")");
		}
		
	}

}
