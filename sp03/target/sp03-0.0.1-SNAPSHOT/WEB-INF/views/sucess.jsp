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
가입완료 <br>
${name}
<script>
let msg = "${param.msg}";
if(msg) {
	alert(msg)
}
</script>
</body>
</html>