<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view/sample.jsp</title>
</head>
<body>
<form action="/sample/ex01">
	<input name="name">
	<input name="age">
	<input name="birth" type="date">
	<input name="profile" type="file">	
	<button>등록</button>
</form>
</body>
</html>