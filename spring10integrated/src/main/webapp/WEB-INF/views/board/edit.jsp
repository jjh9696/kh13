<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
     <h1>게시글 수정</h1>
    
    <form action="edit" method="post">
    	<input type ="hidden" name = "memberId" value = "${memberDto.memberId }" required>
    	<br>
    	<br>
    	
    </form>
    
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>