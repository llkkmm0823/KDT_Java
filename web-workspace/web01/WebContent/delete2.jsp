<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String no = request.getParameter("no");
    	BbsDAO dao = new BbsDAO();
    	int result = dao.delete(Integer.parseInt(no)); //result값이 반환되어도착함. 
    	String resultText = "삭제실패";
    	if(result == 1){
    		resultText = "삭제성공";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<%= resultText %>

</body>
</html>