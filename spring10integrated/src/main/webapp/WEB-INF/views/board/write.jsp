<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h1>게시글 작성</h1>
    
    <form action="write" method="post">
    	작성자 <input type="text" name="boardWriter" value="${sessionScope.loginId}" readonly>
    	제목 <input name="boardTitle" type="text" required> <br> <br>
    	내용 <input name="boardContent" type="text" required> <br> <br>
    	<button>작성</button>
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>