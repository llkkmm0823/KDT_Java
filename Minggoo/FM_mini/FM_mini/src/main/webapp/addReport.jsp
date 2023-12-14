<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>신고 데이터 입력</title>
</head>
<body>
    <h2>신고 데이터 입력</h2>
    <form action="addReportLogic.jsp" method="post">
        <label for="reportNo">신고 번호:</label>
        <input type="text" id="reportNo" name="reportNo"><br><br>
        
        <label for="boothNumber">부스 번호:</label>
        <input type="text" id="boothNumber" name="boothNumber"><br><br>
        
        <label for="userId">사용자 ID:</label>
        <input type="text" id="userId" name="userId"><br><br>
        
        <label for="comment">코멘트:</label>
        <input type="text" id="comment" name="comment"><br><br>
        
        <input type="submit" value="제출">
    </form>
</body>
</html>
