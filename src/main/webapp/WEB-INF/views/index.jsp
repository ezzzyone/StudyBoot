<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="./temp/boot.jsp"></c:import>
<link href="/css/test.css" rel="stylesheet">
<script defer src="/js/test.js"></script>
</head>
<body>
<h1>INDEX</h1>
<h1><spring:message code="hi" var="h"></spring:message></h1>
<h1><spring:message code="test" text="code가 없을 때 출력하는 메세지"></spring:message></h1>
<h1>${h}</h1>
<c:choose>
<c:when test="${empty sessionScope.member}">
<a href="/member/login">login</a>
<a href="/member/join">join</a>
</c:when>
<c:otherwise>
<h3><spring:message code="welcome" arguments="${member.name}"></spring:message></h3>
<h3><spring:message code="welcome2" arguments="${member.id},${member.name}" argumentSeparator=","></spring:message></h3>
<a href="/member/logout">logout</a>
</c:otherwise>
</c:choose>
<h1><a href="./qna/list?page=${page}&search=${search}">QNA</a></h1>
<h1><a href="./qna/write">write</a></h1>
<img src="/img/1.jpg">

<button id="btn1" class="buttons">Test1</button>
<button id="btn2" class="buttons">Test2</button>
<button id="btn3" class="buttons">Test3</button>
</body>
</html>