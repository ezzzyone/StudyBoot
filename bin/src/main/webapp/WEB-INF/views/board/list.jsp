<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Page</title>
<style>
h3{
font-weight: bold;
}
</style>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<h3>작성자 제목 내용</h3> <br>

 <c:forEach items="${vo}" var="vo">
${vo.writer}
<a href="./detail?num=${vo.num}">${vo.title}</a>
${vo.contents} <br>
 </c:forEach>
 
 <!-- a태그를 버튼처럼 보이게 class 줄수있음 -->
 <div>
 <a class="btn btn-primary" href="/board/write">Write</a>
 </div>
 <!-- pagination start -->
    <div class="chefs section-bg" style="padding-bottom: 10px;">
      <nav aria-label="Page navigation example">
        <ul class="pagination">
          <li class="page-item ${pager.pre?'':'disabled'}">
            <a class="page-link" href="./list?page=${pager.startNum-1}&search=${pager.search}" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
            </a>
          </li>
          <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
            <li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}"> ${i}</a> </li>
          </c:forEach>
          <li class="page-item ${pager.next?'':'disabled'}">
            <a class="page-link" href="./list.do?page=${pager.lastNum+1}&search=${pager.search}" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav>
    </div>
    <!-- pagination end -->        
    <script type="text/javascript">
    let result = '${param.result}';
    if(result != ""){
    	if(result=='1'){
    		alert("등록성공");
    	}else{
    		alert("등록실패");
    	}
    }
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
      crossorigin="anonymous"></script>
</body>
</html>