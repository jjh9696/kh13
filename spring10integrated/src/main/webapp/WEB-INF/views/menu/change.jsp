<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
${dto}
    <h1>메뉴 정보 수정</h1>
    
    <form action="change" method="post">
    	번호 : ${dto.menuNo} <input type="hidden" name=menuNo required value="${dto.menuNo}"><br><br>
    	한글메뉴 <input type="text" name=menuNameKor required value="${dto.menuNameKor}"><br><br>
    	영어메뉴 <input type="text" name=menuNameEng required value="${dto.menuNameEng}"><br><br>
    	메뉴종류 <input type="text" name=menuType required value="${dto.menuType}"><br><br>
    	메뉴가격 <input type="number" name=menuPrice required value="${dto.menuPrice}"><br><br>
    	<button>정보 수정</button>
    </form>