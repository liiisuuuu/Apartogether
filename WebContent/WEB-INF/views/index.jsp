<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>home</title>
</head>
<body>
	<div class="container">
	
		<div class="insert-area">
			<form action="${pageContext.request.contextPath}/dd.ict" method="post">
				<input type="hidden" name="cmd" value="login">
				
				<div id="mem-id">
					<label>아이디</label>
					<input type="text" placeholder="아이디를 입력해주세요" name="memId">
				</div>
				
				<div id="mem-pw">
					<label>비밀번호</label>
					<input type="password" placeholder="비밀번호를 입력해주세요" name="memPw">
				</div>
				
				<div class="btn-area">
					<button type="submit">로그인</button>
					<a type="button" href="${pageContext.request.contextPath}/dd.ict?cmd=memberInsert">회원가입</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>