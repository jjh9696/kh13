<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시글 수정</h1>
<form action="edit" method="post">
    <input type="hidden" name="boardNo" value="${boardDto.boardNo}">
    제목<input type="text" name="boardTitle" value="${boardDto.boardTitle}" required><br><br>
<!-- 	textarea는 시작태그와 종료태그 사이에 내용을 작성 -->
<!-- 시작태그와 종료태그 사이에 띄어쓰기나 엔터를 입력하면 그대로 입력되니 조심 다 붙여서 쓰자 -->
    내용 <textarea name="boardContent" required>${boardDto.boardContent}</textarea> 
    <button>수정</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>