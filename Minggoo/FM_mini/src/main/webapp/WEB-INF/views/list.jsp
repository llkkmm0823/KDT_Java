<%@page import="com.multi.FM.ReportVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<ReportVO> list = (ArrayList<ReportVO>)request.getAttribute("list");
	for(ReportVO bag: list){
%>
		신고 고유 번호 <%= bag.getReport_no() %> <br>
		부스 고유 번호 <%= bag.getBooth_no() %> <br>
		부스 이름 <%= bag.getBooth_name() %> <br>
		유저 아이디 <%= bag.getUser_id() %> <br>
		신고 내용 <%= bag.getComment() %> <br>
		유저 타입 <%= bag.getRole() %>
		<hr>
<% } %>
</body>
</html>
