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
<h3>게시물등록</h3>
	<form method="post" action="/board/register">
		제목<input name="title"/>제목
		<input name="writer"/>
		<textarea name="content"></textarea>
		<button>등록</button>
	</form>
</body>
</html>