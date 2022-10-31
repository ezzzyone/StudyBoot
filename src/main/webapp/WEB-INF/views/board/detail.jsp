<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot.jsp"></c:import>
</head>
<body>
${vo.title}
${vo.contents}
<br>
<c:forEach items="${vo.qnaFileVOs}" var="my">
<img src="/file/qna/${my.fileName}">
<a href="/fileDown/qna?fileNum=${my.fileNum}">QnaDown</a>
</c:forEach>

<a href="./update?num=${param.num}">update</a>

</body>
</html>