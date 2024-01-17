<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>이미지실습</h1>

<%--
	img태그
	-페이지에 이미지를 보여줄 수 있는 효과를 부여
	-태그만으로는 정보가 부족하므로 속성(attribute)을 통해 추가 정보를 전달
	-속성은 key=value 형태이며, 속성과 속성 사이는 반드시 띄어쓰기가 필요
	
	-src : 이미지의 결로
	-width : 이미지의 폭(px, %)
	-height : 이미지의 높이(px, %)
	-alt : 접근성 향상을 위한 도움말
--%>

<img alt="돈까스 이미지" width="200px" src="https://i.namu.wiki/i/gMSvGksMaKPdznDSM-QxYwYGN-K1zLqOzOpNSAfOwRlrlx6ZY61kOvHHeAHtk9RWrTnA1nnrPri_XkXSewEkpQ.webp">
<!-- </img> 종료태그가 없음 -->

<hr>

<img alt="돈까스 이미지" width="30%" src="https://i.namu.wiki/i/gMSvGksMaKPdznDSM-QxYwYGN-K1zLqOzOpNSAfOwRlrlx6ZY61kOvHHeAHtk9RWrTnA1nnrPri_XkXSewEkpQ.webp">
<br>
<!-- 	
	
	프로젝트 외부 위치에 있는 이미지는 보안상의 이유로 srC에 설정할 수 없다. 
	
	<img width="400" src="D:\A\image\cat.jpg"> 
	
	이미지를 프로젝트에 포함시켜야 한다(src/main/resources/static)
	이미지를 해당 위치에 포함시키면 주소가 파일명으로 자동 생성된다
	
	http://localhost:8080/파일명
	
	같은 서버의 같은 프로젝트에 있기 때문에 주소를 생략할 수 있다
	-프로토콜 생략 : <img width="400" src="localhost:8080/cat.jpg">
	-host/port 생략 : <img width="400" src="/cat.jpg">
	위와 같은 방식은 절대경로(absolute path)라고 부른다
	/가 있다는 것은 localhost:8080이 생략 되어 있다는 것을 말한다
	
	한편, 다음과 같이 작성해도 된다.
	<img width="400" src="cat.jpg"> (/빠짐)
	위와 같은 방식은 상대경로(relative path)라고 부른다
	
	절대경로는 언제나 한결같은 위치를 가리키고
	상대경로는 현재페이지에 따라 다른 위치를 가리킨다
	
	
-->

<!-- <img width="400" src="http://localhost:8080/cat.jpg"> -->
<img width="400" src="cat.jpg">


	