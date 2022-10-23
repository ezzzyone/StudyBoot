<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${vo.contents}
<br>
<img src="/file/${vo.qnaFileVO.fileName}">
<a href="/fileDown?fileNum=2">Down</a>

<img src="/file/qna/${vo.qnaFileVO.fileName}">
<a href="/fileDown/qna?fileNum=2">NoticeDown</a>


</body>
</html>