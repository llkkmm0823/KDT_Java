<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
//body태그에 있는 것 중에서 특정한 것을 선택한 이후에
//그 선택된 것이 이벤트가 발생했을 때 입력값으로 사용한 이름없는 함수를 실행시켜줘!
//콜백함수 
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url: "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101",
			success: function(json) {
				console.log(json.weeklyBoxOfficeList)
				list = json.weeklyBoxOfficeList
				console.log(list)
				$(list).each(function(i, one) {
					$('#d1').append(one.movieNm + "<br>")
				})
			}
		}) //ajax
	})//b1
})//$
</script>
</head>
<body>
<button id="b1">movie.json읽어와서 추출하기</button>
<hr>
<div id="d1" style="background: pink"></div>
</body>
</html>