<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
    
    <h1>게시글 작성</h1>
    
    <form action="write" method="post">
    	작성자 : ${sessionScope.loginId}<br> <br>
    	
    	제목 <input name="boardTitle" type="text" required> <br> <br>
<!-- 		여러 줄 입력하고 싶다면 textarea 태그를 사용한다 -->
<!--     	내용 <input name="boardContent" type="text" required> <br> <br> -->
<!-- 		textarea태그는 종료 태그가 필요하며, type과 value를 설정할 수 없다 -->
<!-- 		<textarea name="boardContent" required></textarea> -->
		내용 <textarea name="boardContent" required></textarea>
    	<button>작성</button>
    <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>