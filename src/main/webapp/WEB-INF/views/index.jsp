<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="./temp/boot.jsp">boot</c:import>
<link href="/css/test.css" rel="stylesheet">
</head>
<body>
<h1>INDEX</h1>
<h1><a href="./qna/list?page=${page}&search=${search}">QNA</a></h1>
<h1><a href="./qna/write">write</a></h1>
<img src="/img/1.jpg">

</body>
</html>