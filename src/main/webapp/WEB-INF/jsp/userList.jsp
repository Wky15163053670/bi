<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 500px;">
		<table align='center' border='1' cellspacing='0'>
			<tr>
	            <td>会员ID</td>
	            <td>会员名称</td>
	            <td>会员密码</td>
	            <td>会员年龄</td>
	        </tr>
			<c:forEach items="${userList}" var="user" varStatus="st">
		        <tr>
		            <td>${user.id}</td>
		            <td>${user.user_name}</td>
		            <td>${user.mobile}</td>
		            <td>${user.age}</td>
		        </tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>