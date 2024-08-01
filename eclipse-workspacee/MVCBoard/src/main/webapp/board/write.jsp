<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validateForm(form) {
		if(form.name.value == "")  {
			alert("작성자를 입력하세요.")
			form.name.focus()
			return false;
		}
		if(form.title.value == "")  {
			alert("제목을 입력하세요.")
			form.title.focus()
			return false;
		}		
		if(form.cotent.value == "")  {
			alert("내용을 입력하세요.")
			form.cotent.focus()
			return false;
		}			
		
	}

</script>
</head>
<body>
	<h2>글쓰기(Write)</h2>
	<form name="writeFrm" action="../mvcboard/write.do" method="post" 
			enctype="multipart/form-data" onsubmit="return validateForm(this)">
		<table border="1" width="90%">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="name" style="width:150px"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" style="width:90%"></td>
			</tr>			
			<tr>
				<td>내용</td>
				<td><textarea name="content" style="width:90%;height: 100px;"></textarea></td>
			</tr>			
			
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit">작성 완료</button>
				</td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>