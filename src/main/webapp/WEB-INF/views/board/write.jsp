<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script defer src="/js/jqueryAjax.js"></script>
<!-- summernote JQUERY -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<!-- summernote bootstrap -->
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
 
<!-- include summernote css/js -->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
    
<title>Insert title here</title>
</head>
<body>
<div>
<form:form method="post" enctype="multipart/form-data" modelAttribute="qnaVO">
      <div class="mb-3">
         <label for="formGroupExampleInput" cssClass="form-label">작성자</label>
         <form:input cssClass="form-control" path="writer"/>
         <form:errors path="writer"></form:errors>
      </div>

      <div class="mb-3">
        <label for="formGroupExampleInput" cssClass="form-label">제목</label>
        <form:input cssClass="form-control" path="title" placeholder="제목을 입력하세요."/>
        <form:errors path="title"></form:errors>
      </div>
      
      <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">글 내용</label>
        <form:textarea cssClass="form-control" path="contents" id="contents" rows="5" placeholder="내용을 입력하세요."></form:textarea>
         <form:errors path="contents"></form:errors>
      </div>
      
      <div cssClass="mb-3" id="fileDiv">
        <form:button id="fileAdd">FileAdd</form:button>
      </div>

        <!-- <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">사진</label>
      	<input type="file" name="files">
       </div>
        <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">사진</label>
      	<input type="file" name="files">
       </div> -->
 <button class="btn btn-primary" type="submit">Write</button>
</form:form>
</div>
<!-- 부트스트랩 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<script type="text/javascript">
   $("#contents").summernote();
</body>
</html>