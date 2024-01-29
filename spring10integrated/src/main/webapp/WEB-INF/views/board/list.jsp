<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
     <h1>게시글 목록 </h1> <a href="write">글 작성</a>
    
<!--     검색창 -->
    <form action="list" method="get">
    	<select name="column">
    		<option value="board_title" ${param.column == 'board_title'
    		 ? 'selected' : '' }>제목</option>
    		<option value="board_writer" ${param.column == 'board_writer'
    		 ? 'selected' : '' }>작성자</option>
    	</select>
    	<input type="text" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
	<button>검색</button>
    </form>
    
<!--     목록 -->
	<table border="1" width="300">
    <thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="boardDto" items="${list}">
		<tr>
			<td>${boardDto.boardNo }</td>
			<td>
			<a href="detail?boardTitle=${boardDto.boardTitle }">${boardDto.boardTitle }</a>
			</td>
			<td>${boardDto.boardWriter }</td>
		</tr>
		</c:forEach>
			
	</tbody>
	</table>
	
				
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>