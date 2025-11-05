<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/list.jsp</title>
</head>
<body>
	<form method="post" action="/board/register">
		<input name="title"/>제목
		<input name="writer"/>
		<textarea name="content"></textarea>
		<button>등록</button>
	</form>
</body>
</html>