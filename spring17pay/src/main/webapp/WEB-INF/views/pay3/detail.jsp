<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제 상세 정보</title>
</head>
<body>
	<h1>결제 상세 정보</h1>
	<hr>
	${paymentDto}
	<hr>
	${detailList}
	<hr>
	${responseVO}
</body>
</html>