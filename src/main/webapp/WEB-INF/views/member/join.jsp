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
<form action="join" method="post">
ID<input type="text" name="id"/>
PW<input type="text" name="pw"/>
NAME<input type="text" name="name"/>
EMAIL<input type="text" name="email"/>

<button type="submit">join</button>
</form>
</body>
</html>