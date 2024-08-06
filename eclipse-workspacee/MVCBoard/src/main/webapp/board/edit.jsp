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
		if(form.content.value == "")  {
			alert("내용을 입력하세요.")
			form.content.focus()
			return false;
		}					
		
	}

</script>
</head>
<body>
	<h2>게시판 - 수정하기 </h2>
	<form action="../mvcboard/edit.do" method="post" enctype="multipart/form-data" 
				onsubmit="return validateForm(this)" name="writeFrm">
		<input type="hidden" name="idx" value="${dto.idx }" />
		<input type="hidden" name="prevOfile" value="${dto.ofile }" />
		<input type="hidden" name="prevSfile" value="${dto.sfile }" />
		
		<table border="1" width="90%">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="name" style="width: 150px;" value="${dto.name }" /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" style="width: 90%;" value="${dto.title }" /></td>
			</tr>	
			<tr>
				<td>내용</td>
				<td>
					<textarea name="content" style="width: 90%; height: 100px;">
						${dto.content }
					</textarea>
				</td>
			</tr>			
			<tr>
				<td>첨부파일</td>
				<td>
					<input type="file" name="ofile" />
				</td>
			</tr>	
			<tr>
				<td colspan="2" align="center">
					<button type="submit">수정 완료</button>
					<button type="reset">초기화</button>
					<button type="button" onclick="location.href='../mvcboard/list.do'">목록가기</button>
				</td>
			</tr>		
		</table>
	</form>
</body>
</html>










