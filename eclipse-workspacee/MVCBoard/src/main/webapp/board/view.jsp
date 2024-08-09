<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>상세 보기</h2>
  <table border="1" width="90%">
  	<colgroup>
  		<col width="15%"/><col width="35%"/>
  		<col width="15%"/><col width="*"/>
  	</colgroup>
  	
  	<tr>
  		<td>번호</td><td>${dto.idx }</td>
  		<td>작성자</td><td>${dto.name }</td>
  	</tr>
  	
  	<tr>
  		<td>작성일</td><td>${dto.postdate }</td>
  		<td>조회수</td><td>${dto.visitcount }</td>
  	</tr>  	
   	<tr>
  		<td>제목</td>
  		<td colspan="3">${dto.title }</td>
  	</tr>  	 	
   	<tr>
  		<td>내용</td>
  		<td colspan="3">
  			${dto.content }
  			<c:if test="${not empty dto.ofile and isImage eq true}">
  				<br /><img src="../Uploads/${dto.sfile }" style="max-width: 100%;" />
  			</c:if>
  		</td>
  	</tr>  
  	
  	<tr>
   		<td>첨부파일</td>
   		<td>
   			<c:if test="${not empty dto.ofile}">
   				${dto.ofile }
   				<a href="../mvcboard/download.do?ofile=${dto.ofile }&sfile=${dto.sfile}&idx=${dto.idx}">[다운로드]</a>
   			</c:if>
   		</td> 		
  		<td>다운로드 수</td><td>${dto.downcount }</td> 	
  	</tr>  
  	
  	<tr>
  		<td colspan="4" align="center">
  			<button type="button" onclick="location.href='../mvcboard/pass.do?mode=edit&idx=${param.idx}'">수정하기</button>
  			<button type="button" onclick="location.href='../mvcboard/pass.do?mode=delete&idx=${param.idx}'">삭제하기</button>
  			<button type="button" onclick="location.href='../mvcboard/list.do'">목록가기</button>
  		</td>
  	</tr>	
  </table>
</body>
</html>





