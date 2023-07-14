
<%@page import="ssg.com.a.dto.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int seq = (Integer)request.getAttribute("seq");
	BbsDto dto = (BbsDto)request.getAttribute("dto");
%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>일정 수정</h1>
<br>

<div align="center">

<form action="bbsupdateAf.do" method="post">
<input type="hidden" name="seq" value="<%=seq %>">

<table border="1">
<col width="200"><col width="500">
<tr>
	<th>아이디</th>
	<td><%=dto.getId() %></td>
</tr>
<tr>
	<th>제목</th>
	<td>
		<input type="text" size="60" name="title" value="<%=dto.getTitle() %>">
	</td>
</tr>
<tr>
	<th>내용</th>
	<td>
		<textarea rows="10" cols="60" name="content"><%=dto.getContent()%></textarea>
	</td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" value="수정완료">
	</td>
</tr>

</table>
</form>

</div>


</body>
</html>