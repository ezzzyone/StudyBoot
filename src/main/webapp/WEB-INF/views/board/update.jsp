<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script defer src="/js/jqueryAjax.js"></script>
    <c:import url="../temp/boot.jsp"></c:import>
</head>
<body>
    <input type="hidden" value="${param.num}" name="num">
    <form action="update" method="post" enctype="multipart/form-data">
  <div>title<input type="text" value="${vo.title}" name="title"></div>
  <div>contents<input type="text" value="${vo.contents}" name="contents"></div>
<br>

<c:forEach items="${vo.qnaFileVOs}" var="my">
<div class="mb-3" id="fileDiv" data-file-size="${vo.qnaFileVOs.size()}">
<img src="/file/qna/${my.fileName}">
<button type="button" class="delFile" value="${my.fileNum}">X</button>
</div>
</c:forEach>

<div class="mb-3" id="fileDiv">
    <button type="button" id="fileAdd">FileAdd</button>
  </div>

  <button id="updateForm" type="button">update</button>
</form>



</body>
</html>