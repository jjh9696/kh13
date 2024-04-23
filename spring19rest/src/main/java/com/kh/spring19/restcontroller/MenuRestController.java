package com.kh.spring19.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.MenuDao;
import com.kh.spring19.dto.MenuDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

//문서용 설정 추가
@Tag(name = "메뉴정보 관리도구", description = "Menu 테이블 CRUD 처리")

@CrossOrigin
@RestController
@RequestMapping("/Menu1")
public class MenuRestController {
	@Autowired
	private MenuDao menuDao;
	
	//문서용 설정 추가
	@Operation(
		description = "메뉴 목록 조회",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "조회 성공",
				content = {
					@Content(
						mediaType = "application/json",
						array = @ArraySchema(
							schema = @Schema(implementation = MenuDto.class)
						)
					) 
				}
			),
			@ApiResponse(
				responseCode = "500",
				description = "서버 오류",
				content = {
					@Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = @ExampleObject("server error")
					)
				}
			)
		}
	)
	@GetMapping("/")
	public List<MenuDto> list() {
		return menuDao.selectList();
	}
	
//	@GetMapping("/{MenuNo}")
//	public MenuDto find(@PathVariable int MenuNo) {
//		MenuDto MenuDto = MenuDao.selectOne(MenuNo);
//		return MenuDto;
//	}
	
//	조회되지 않는 경우(null인 경우)는 404번으로 처리하고 싶다면
	@Operation(
		description = "메뉴 상세 조회",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "조회 성공",
				content = {
					@Content(
						mediaType = "application/json",
						schema = @Schema(implementation = MenuDto.class)
					)
				}
			),
			@ApiResponse(
				responseCode = "404",
				description = "해당 사번의 데이터가 없음",
				content = @Content(
					mediaType = "text/plain", 
					schema = @Schema(implementation = String.class),
					examples = @ExampleObject("not found")
				)
			),
			@ApiResponse(
				responseCode = "500",
				description = "서버 오류",
				content = @Content(
					mediaType = "text/plain", 
					schema = @Schema(implementation = String.class),
					examples = @ExampleObject("server error")
				)
			)
		}
	)
	
	@GetMapping("/{menuNo}")
	public ResponseEntity<MenuDto> find(@PathVariable int menuNo) {
		MenuDto menuDto = menuDao.selectOne(menuNo);
		if(menuDto == null) {
			//return ResponseEntity.notFound().build();
			return ResponseEntity.status(404).build();
		}
		//return ResponseEntity.ok(menuDto);
		return ResponseEntity.status(200).body(menuDto);
	}
	
	@PostMapping("/")
	public MenuDto save(@RequestBody MenuDto menuDto) {
		int sequence = menuDao.sequence();//번호생성
		menuDto.setMenuNo(sequence);//번호설정
		menuDao.insert(menuDto);//등록
		return menuDao.selectOne(sequence);//등록된 결과를 조회하여 반환
	}
	
	// 조회되지 않는 메뉴(존재하지 않는 메뉴)은 404번으로 반환
	
	@PutMapping("/")
	public ResponseEntity<?> editAll(@RequestBody MenuDto menuDto) {
		boolean result = menuDao.editAll(menuDto);
		if(result == false) {
			//return ResponseEntity.notFound().build();
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok().build();
	}
	
	@PatchMapping("/")
	public ResponseEntity<?> editUnit(@RequestBody MenuDto menuDto) {
		boolean result = menuDao.editUnit(menuDto);
		if(result == false) {
			//return ResponseEntity.notFound().build();
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok().build();
	}
	
	//@Operation(작업에 대한 설명)
	@DeleteMapping("/{menuNo}")
	public ResponseEntity<?> delete(@PathVariable int menuNo) {
		boolean result = menuDao.delete(menuNo);
		if(result == false) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}
	
}
