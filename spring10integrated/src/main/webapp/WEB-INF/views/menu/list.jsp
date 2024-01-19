<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 검색 -->

<form action = "list" method = "get">
	<select name="column">
		<option value="menu_name_kor" ${param.column == 'menu_name_kor' ? 'selected' : ''}>한글메뉴</option>
		<option value="menu_name_eng" ${param.column == 'menu_name_eng' ? 'selected' : ''}>영문메뉴</option>
	</select>
	<input type="search" name="keyword" value="${param.keyword}">
	<button>검색</button>
</form>

<c:forEach var="dto" items="${list}">
	<h2>
	번호 = "${dto.menuNo}"
	한글메뉴 = "${dto.menuNameKor}"
	영문메뉴 = "${dto.menuNameEng}"
	메뉴종류 = "${dto.menuType}"
	메뉴가격 = "${dto.menuPrice}"
	</h2>

</c:forEach>