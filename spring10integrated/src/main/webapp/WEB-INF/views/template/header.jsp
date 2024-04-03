<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
	HTML은 여러 버전이 있었으며, 지금은 HTML 5가 표준
	- 디자인과 관련된 요소를 많이 제거하고 다른 언어들과의 화합을 고려
	- 자체적으로 제공하는 컴포넌트(화면도구)를 많이 늘렸음
	
	<!DOCTYPE html> 은 HTML5 임을 표시하는 것
	
	<html> 은 HTML 문서의 범위를 정하는 태그(없으면 자동으로 생김)
	<html> 은 <head>와 <body>로 나뉜다
	<head> 에는 문서의 정보를 작성하고 <body>에는 화면에 표시할 내용을 작성
	
	<meta>는 홈페이지의 정보를 설정하는 태그
	<title>은 문서의 제목이며 브라우저의 탭 부분에 표시됨
 --%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>홈페이지 레이아웃 만들기</title>

<!-- 구글 폰트 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap"
	rel="stylesheet">

<!-- 내가 구현한 스타일 -->
<link rel="stylesheet" type="text/css" href="/css/commons.css">
<!--     <link rel="stylesheet" type="text/css" href="/css/test.css"> -->
<link rel="stylesheet" type="text/css" href="/css/layout.css">

    <!-- font awesome 아이콘 CDN -->
    <link rel="stylesheet" type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

    <!-- bootstrap cdn -->
    <!-- <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"> -->
    <link rel="stylesheet" type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.3/cosmo/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
</style>

<!--  jQuery CDN -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>

<!-- summernote cdn -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<style>
	.note-editor {
		border: 1px solid #636e72 !important;
	}
</style>
<script>
	$(function() {
		var options = {
			//에디터 툴바(메뉴) 설정
			toolbar : [
				// [groupName, [list of button]]
				[ 'style', [ 'bold', 'italic', 'underline' ] ],
				[ 'fontsize', [ 'fontname', 'fontsize' ] ],
				[ 'color', [ 'forecolor', 'backcolor' ] ],
				[ 'para', [ 'style', 'ul', 'ol', 'paragraph' ] ],
				[ 'insert', [ 'picture', 'link', 'hr' ] ], 
			],
			//기본높이 설정(단위 : px)
			height : 200,
			minHeight : 200,
			maxHeight : 300,
			//안내문구 설정
			//placeholder: "입력하세요",
			callbacks : {
				onImageUpload : function(files) {
					var editor = this;
					
					var formData = new FormData();
					for (var i = 0; i < files.length; i++) {
						formData.append("attachList", files[i]);
					}

					$.ajax({
						url : "/rest/board_attach/upload",
						method : "post",
						data : formData,
						processData : false,
						contentType : false,
						success : function(response) {
							if (response == null)
								return;

							for (var i = 0; i < response.length; i++) {
								var tag = $("<img>")
									.attr("src", "/download?attachNo=" + response[i])
									.attr("data-key", response[i])
									.addClass("server-img");
								$(editor).summernote("insertNode", tag[0]);
							} 
						}
					});
				}
			}
		};

		$("[name=boardContent]").summernote(options);
	});
</script>

<!-- 내가 만든 JS -->
<script src="/js/commons.js"></script>

</head>
<body>

	<main>
	<div class="container-fluid">
        <div class="row my-4">
            <div class="offset-md-1 col-md-10">

                <!-- 메뉴바 -->
                <nav class="navbar navbar-expand-lg bg-dark fixed-top" data-bs-theme="dark">
                    <div class="container-fluid">
                        <!-- 좌상단 글자 -->
                        <a class="navbar-brand" href="/">햄버거왕의 교실</a>

                        <!-- 햄버거 메뉴 버튼 -->
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbar-wrapper" aria-controls="navbar-wrapper" aria-expanded="false"
                            aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <!-- 실제 메뉴 영역 -->
                        <div class="collapse navbar-collapse" id="navbar-wrapper">
                            <ul class="navbar-nav me-auto">
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" 
                                        href="#" role="button"
                                        aria-haspopup="true" aria-expanded="false">데이터관리</a>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="/pocketmon/list">포켓몬스터정보</a>
                                        <a class="dropdown-item" href="/emp/list">사원정보</a>
                                        <a class="dropdown-item" href="/menu/list">메뉴정보</a>
                                        <!-- <div class="dropdown-divider"></div> -->
                                        <a class="dropdown-item" href="/student/list">학생성적정보</a>
                                    </div>
                                </li>

                                <li class="nav-item">
                                    <a class="nav-link" href="/board/list">게시판</a>
                                </li>
                            </ul>
                            <div class="d-flex">
                            	<c:choose>
									<c:when test="${sessionScope.loginId != null}">
										<a href="${pageContext.request.contextPath}/member/mypage" class="link-light link-underline-opacity-0">
		                                    <i class="fa-solid fa-user"></i>
		                                    ${sessionScope.loginId} 님
		                                </a>
		                                <a href="${pageContext.request.contextPath}/member/logout" class="link-light ms-4 link-underline-opacity-0">
		                                    <i class="fa-solid fa-arrow-right-from-bracket"></i>
		                                    로그아웃
		                                </a>
									</c:when>
									<c:otherwise>
										<a href="${pageContext.request.contextPath}/member/join" class="link-light link-underline-opacity-0">
		                                    <i class="fa-solid fa-user-plus"></i>
		                                    회원가입
		                                </a>
		                                <a href="${pageContext.request.contextPath}/member/login" class="link-light ms-4 link-underline-opacity-0">
		                                    <i class="fa-solid fa-arrow-right-to-bracket"></i>
		                                    로그인
		                                </a>
									</c:otherwise>
								</c:choose>
                                
                            </div>
                        </div>
                    </div>
                </nav>
                
		<%-- <div class="header">
			<h1 class="center"><a href="/" class="link">KH정보교육원</a></h1>
		</div>
		<div class="nav">
			<ul class="menu">
				<li><a href="/"> <i class="fa-solid fa-house"></i> HOME
				</a></li>

				<li><a href="#">데이터관리</a>
					<ul>
						<li><a href="/pocketmon/list">포켓몬스터</a></li>
						<li><a href="/emp/list">사원정보</a></li>
						<li><a href="/menu/list">메뉴정보</a></li>
						<li><a href="/student/list">학생성적</a></li>
					</ul></li>

				<li><a href="/board/list">자유게시판</a></li>

				관리자 메뉴는 관리자에게만 출력
				<c:if test="${sessionScope.loginLevel == '관리자'}">
					<li><a href="#">관리자메뉴</a>
						<ul>
							<li><a href="/admin/member/search">회원관리</a></li>
							<li><a href="/admin/item/list">충전상품관리</a></li>
							<li><a href="#">통계</a>
								<ul>
									<li><a href="/admin/stat/pocketmon">포켓몬통계</a></li>
									<li><a href="/admin/stat/emp">사원통계</a></li>
									<li><a href="/admin/stat/menu">메뉴통계</a></li>
									<li><a href="/admin/stat/member">회원통계</a></li>
								</ul></li>
						</ul></li>
				</c:if>

				<li class="menu-end"><c:choose>
						<c:when test="${sessionScope.loginId != null}">
							<a href="/member/mypage"> <i class="fa-solid fa-user"></i>
								${sessionScope.loginId}
							</a>
							<ul>
								<li><a href="/point/charge">포인트충전</a></li>
								<li><a href="/member/logout">로그아웃</a></li>
							</ul>
						</c:when>
						<c:otherwise>
							<a href="/member/login">로그인</a>
							<ul>
								<li><a href="/member/join">회원가입</a></li>
							</ul>
						</c:otherwise>
					</c:choose></li>
			</ul>
		</div> --%>
		<div class="section mt-4 pt-4">
			<!--             <div class="aside"></div> -->
			<div class="article">