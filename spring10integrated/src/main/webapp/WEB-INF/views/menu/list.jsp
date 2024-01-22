<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 검색 -->

<!-- <form action = "list" method = "get"> -->
<!-- 	<select name="column"> -->
<%-- 		<option value="menu_name_kor" ${param.column == 'menu_name_kor' ? 'selected' : ''}>한글메뉴</option> --%>
<%-- 		<option value="menu_name_eng" ${param.column == 'menu_name_eng' ? 'selected' : ''}>영문메뉴</option> --%>
<!-- 	</select> -->
<%-- 	<input type="search" name="keyword" value="${param.keyword}"> --%>
<!-- 	<button>검색</button> -->
<!-- </form> -->

<%-- <c:forEach var="dto" items="${list}"> --%>
<!-- 	<h2> -->
<%-- 	번호 = "${dto.menuNo}" --%>
<%-- 	한글메뉴 = "${dto.menuNameKor}" --%>
<%-- 	영문메뉴 = "${dto.menuNameEng}" --%>
<%-- 	메뉴종류 = "${dto.menuType}" --%>
<%-- 	메뉴가격 = "${dto.menuPrice}" --%>
<!-- 	</h2> -->

<%-- </c:forEach> --%>

<h1>메뉴 목록 <a href="insert">+신규등록</a></h1>

<%-- 검색창 --%>
<form action="list" method="get">
	<select name="column">
		<option value="menu_name_kor" ${param.column == 'menu_name_kor' ? 'selected' : ''}>메뉴명(한글)</option>
		<option value="menu_name_eng" ${param.column == 'menu_name_eng' ? 'selected' : ''}>메뉴명(영문)</option>
		<option value="menu_type" ${param.column == 'menu_type' ? 'selected' : ''}>메뉴유형</option>
	</select>
	<input type="text" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
	<button>검색</button>
</form>

<%-- 목록 출력 --%>
<table border="1">
	<thead>
		<tr>
			<th>메뉴번호</th>
			<th>메뉴이름</th>
			<th>메뉴유형</th>
			<th>판매가격</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.menuNo}</td>
			<td>
				<a href="detail?menuNo=${dto.menuNo}">${dto.menuNameKor}</a>
				(${dto.menuNameEng})
			</td>
			<td>${dto.menuType}</td>
<%-- 			<td align="right">${dto.menuPrice}</td> --%>
			<td align="right">
				<fmt:formatNumber value="${dto.menuPrice}" pattern="#,##0"/> 
				원
			</td>
			<td>
			<a href="detail?menuNo=${dto.menuNo}">이동</a>
			</td>
		</tr>
		</c:forEach>
	</tbody>	
</table>