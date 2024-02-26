<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-500">
	<div class="cell center">
		<h1>판매 상품 등록</h1>
	</div>
	<%--
		파일을 전송하려는 form은 다음과 같이 설정해야 한다
		-method=post
		-encType=multipart/form-data	
	 --%>
		<form action="add" method="post" enctype="multipart/form-data">
			<div class="cell">
				상품명 <input class="tool w-100" type="text" name="itemName" required> <br> <br> 
			 </div>
			 <div class="cell">
			판매액 <input class="tool w-100" type="number" name ="itemPrice" required> <br> <br>
			</div>
			<div class="cell"> 
			충전액 <input class="tool w-100" type="number" name = "itemCharge" required> <br> <br> 
			</div>
			<%-- 
			파일 선택은 input[type=file]로 한다
			-accept를 통해 원하는 유형만 선택할 수 있다
			 --%>
			
		<!-- 	이미지 <input type="file" name = "attach" required accept=".png, .jpg, .gif"> <br> <br> -->
			<div class="cell"> 이미지 </div>
			<div class="cell"> 
				<input type="file" name = "attach"  accept="image/*" >
			</div>
			<div class="cell right">
				<button class="btn positive">신규등록</button>
			</div>
		</form>
</div>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>