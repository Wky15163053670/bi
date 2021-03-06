<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String path = request.getContextPath();  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Login</title>
		<script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
	    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
	    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/login/css/login.css">
	</head>
<body>
	<div class="container">
        <div class="form row">
			<form action="submitLogin" method="post">
				<div class="form-horizontal col-md-offset-3" id="login_form">
					<h3 class="form-title">LOGIN</h3>
					<div class="col-md-9">
						<div class="form-group">
							<i class="fa fa-user fa-lg"></i>
							<input class="form-control required" type="text" placeholder="Username" id="username" name="user_id" autofocus="autofocus" maxlength="20"/>
						</div>
						<div class="form-group">
								<i class="fa fa-lock fa-lg"></i>
								<input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
						</div>
						<div class="form-group">
							<label class="checkbox">
								<input type="checkbox" name="remember" value="1"/>记住我
							</label>
						</div>
						<div class="form-group col-md-offset-9">
							<button type="submit" class="btn btn-success pull-right" name="submit">登录</button>
						</div>
					</div>
				</div>
			</form>
        </div>
    </div>
</body>
</html>