<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" integrity="sha512-rqQltXRuHxtPWhktpAZxLHUVJ3Eombn3hvk9PHjV/N5DMUYnzKPC1i3ub0mEXgFzsaZNeJcoE0YHq0j/GFsdGg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style type="text/css">
	* { box-sizing: border-box; }
	a { text-decoration: none; }
	form {
		width: 400px;
		height: 500px;
		display: flex;
		flex-direction: column;
		align-items: center;
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%, -50%);
		border: 1px solid rgb(89,117,196);
		border-radius: 10px;
	}	
	input[type='text'], input[type='password'] {
		width: 300px;
		height: 40px;
		border: 1px solid rgb(89,117,196);
		border-radius: 5px;
		padding: 0 10px;
		margin-bottom: 10px;
	}
	button {
		background-color: rgb(89,117,196);
		color: white;
		width: 300px;
		height: 50px;		
		font-size: 17px;
		border: none;
		border-radius: 5px;
		margin: 20px 0 30px 0;
	}	
	#title {
		font-size: 30px;
		margin: 40px 0 30px 0;
	}
	#msg {
		height: 30px;
		text-align: center;
		font-size: 16px;
		color: red;
		margin-bottom: 20px;
	}	
</style>
</head>
<body>
	
	<form action="<c:url value="/login/login" />" method="post" onsubmit="return formCheck(this)">
		<h3 id="title">Login</h3>
		<div id="msg">
			<c:if test="${not empty param.msg }">
				<i fa fa-exclamation-circle>${URLDecoder.decode(param.msg) }</i>
			</c:if>
		</div>
		
		<input type="text" name="id" placeholder="이메일 입력" value="${cookie.id.value }" autofocus />
		<input type="password" name="pwd" placeholder="비밀번호" />
		<input type="hidden" name="toURL" value="${param.toURL }" />
		
		<button>로그인</button>
		
		<div>
			<label><input type="checkbox" name="rememberId" value="on" ${empty cookie.id.value ? "" : "checked" } />아이디 기억</label>
			<a href="#">비밀번호 찾기</a>
			<a href="#">회원가입</a>
		</div>
	</form>
	
	<script type="text/javascript">
		function formCheck(frm) {
			let msg =''
			
			if(frm.id.value.length == 0) {
				setMessage('id를 입력해주세요', frm.id)
				return false;
			}
			
			if(frm.pwd.value.length == 0) {
				setMessage('password를 입력해주세요.', frm.pwd)
				return false;
			}			
			
			return true;
			
		}
		/* 서버가 먼저 해석함. ${msg}이 부분을 EL로 해석함. 그 결과를 브라우저에 보내줌  
			ES6는 템플릿 리터럴이라는 새로문 문자열 표기법으로 해석함.
		*/
		function setMessage(msg, element) {
			document.getElementById("msg").innerHTML = `<i class="fa fa-exclamation-circle" >${'${msg}'}</i> `;
			if (element) {
				element.select();			// 값을 잘못 입력되었을 때 그 요소를 선택되게하는 것임
			}
		}
	</script>	
</body>
</html>