<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	죄송합니다. 문제가 발생하였습니다.<br>
	발생된 문제 : ${requestScope.errorMsg}<br>

	<a href="${pageContext.request.contextPath}/main?command=main"> 리스트로 돌아가기</a> 
	<a href="javascript:history.back()">뒤로가기</a>
</body>
</html>