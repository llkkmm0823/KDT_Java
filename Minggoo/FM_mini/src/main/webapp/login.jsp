<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>모든 축제의 부스를 담다 - 부스락</title>
    <link rel="stylesheet" href="resources/css/login.css" type="text/css">
    <script src="resources/js/jquery-1.12.3.js"></script>
    <script src="resources/js/login.js" defer type="text/javascript"></script>
    <script src="https://kit.fontawesome.com/fdb840a8cc.js" crossorigin="anonymous"></script>
</head>
<body>
    <header>
        <div class="wrap">
            <div class="logo">
                <a href="main.jsp">
					<img src="resources/img/logo.png" alt="로고">
                </a>
            </div>
            <nav class="menu">
                <ul class="navi">
                    <li><a href="#">축제리스트</a></li>
                    <li><a href="#">전국축제지도</a></li>
                    <li><a href="#">고객센터</a>
                        <ul class="submenu">
                            <li><a href="#">자주 묻는 질문</a></li>
                            <li><a href="#">문의하기</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
            <div class="log">
            	<ul class="logbtn">
                    <li><a href="#">로그인</a></li>
                    <li><a href="#">회원가입</a></li>
                </ul>
            </div>
        </div>
    </header>
    <div class="bodywrap">
    	<div class="loginform">
    		<div class="inputform">
    			<p class="text">Email</p>
    			<input placeholder="  user@adress.com">
    			<p class="text">Password</p>
    			<input placeholder="  password">
    			<button class="login">로그인</button>
    			<div class="btn">
	    			<button class="findid">아이디 찾기</button>
	    			<button class="findpw">비밀번호 찾기</button>
	    			<button class="signup">회원가입</button>
    			</div>
    		</div>
    	</div>
    </div>
    <footer>
 		<div class="copy">
             COPYRIGHTⓒ by FM. ALL RIGHTS RESERVED
        </div>
    </footer>
</body>
</html>
