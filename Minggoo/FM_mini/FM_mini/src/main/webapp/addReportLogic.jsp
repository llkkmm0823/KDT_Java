<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.multi.FM.ReportController" %>

<%
    int reportNo = Integer.parseInt(request.getParameter("reportNo"));
    int boothNumber = Integer.parseInt(request.getParameter("boothNumber"));
    String userId = request.getParameter("userId");
    String comment = request.getParameter("comment");

    ReportController controller = new ReportController();
    controller.addReport(reportNo, boothNumber, userId, comment);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>신고 데이터 입력</title>
</head>
<body>
    <h2>신고가 성공적으로 추가되었습니다!</h2>
</body>
</html>
