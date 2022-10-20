<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

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
<form action="write" method="post" enctype="multipart/form-data">
      <div class="mb-3">
         <label for="formGroupExampleInput" class="form-label">작성자</label>
         <input type="text" class="form-control" name="writer">
      </div>

      <div class="mb-3">
        <label for="formGroupExampleInput" class="form-label">제목</label>
        <input type="text" class="form-control" name="title" placeholder="제목을 입력하세요.">
      </div>
      
      <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">글 내용</label>
        <textarea class="form-control" name="contents" id="contents" rows="5" placeholder="내용을 입력하세요."></textarea>
      </div>
      
        <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">사진</label>
      	<input type="file" name="files">
       </div>
        <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">사진</label>
      	<input type="file" name="files">
       </div>

 <button class="btn btn-primary" type="submit">Write</button>
</form>
</div>
<!-- 부트스트랩 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<script type="text/javascript">
   $("#contents").summernote();
</body>
</html>