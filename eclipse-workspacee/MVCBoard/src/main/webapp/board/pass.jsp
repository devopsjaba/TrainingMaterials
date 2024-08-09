<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validateForm(form) {
		if(form.pass.value == "")  {
			alert("비밀번호를 입력하세요.")
			form.pass.focus()
			return false;
		}		
	}

</script>
</head>
<body>
	<h2> 게시판 - 패스워드 검증</h2>
	<form action="../mvcboard/pass.do" method="post" name="writeFrm" onsubmit="return validateForm(this)">
		<input type="hidden" name="idx" value="${param.idx }" />
		<input type="hidden" name="mode" value="${param.mode }" />
		<table border="1" width="90%">
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">비밀번호 확인</button>
					<button type="reset">초기화</button>
					<button type="button" onclick="location.href='../mvcboard/list.do'">목록가기</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>






