<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TEST</title>
<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/rsa/jsbn.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/rsa/rsa.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/rsa/prng4.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/rsa/rng.js"></script>
</head>
<body>
<h2>LOGIN</h2>
	<input type="hidden" value="${RSAModulus}"/>
	<input type="hidden" value="${RSAExponent}"/>
	<input type="text" name="userId" id="userId"/>
	<input type="password" name="password" id="password"/>
	<button type="button" >로그인</button>
<form action="">
</form>

</body>
</html>