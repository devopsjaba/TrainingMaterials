<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
	<h2>게시판 (파일첨부가능) - 목록보기</h2>
	<form action="#">
		<table>
			<tr>
				<td align="center">
					<select name="searchField">
						<option value="title">제목</option>
						<option value="content">내용</option>
					</select>
					<input type="text" name="searchWord" />
					<input type="submit" value="검색" />
				</td>
			</tr>
		</table>
	</form>
	
	<!-- 게시물 목록  -->
	<table border="1" width="90%">
		<tr>
			<th width="10%">번호</th>
			<th width="*">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
			<th width="8%">첨부</th>
		</tr>
		<c:choose>
			<c:when test="${empty boardLists }">	<!-- 게시물이 없을때 -->
				<tr>
					<td colspan="6" align="center">등록된 게시물이 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>							<!-- 게시물이 있을때 -->
				<c:forEach items="${boardLists }" var="row" varStatus="loop">
					<tr align="center">
						<td>
							${row.idx }
						</td>
						<td>
							${row.title }
						</td>
						<td>${row.name }</td>
						<td>${row.visitcount }</td>
						<td>${row.postdate }</td>
						<td>${row.ofile }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	
	<table border="1" width="90%">
		<tr>
			<td></td>
			<td width="100"><button type="button" 
					onclick="location.href='../mvcboard/write.do'">글쓰기</button></td>
		</tr>
	</table>
</body>
</html>












