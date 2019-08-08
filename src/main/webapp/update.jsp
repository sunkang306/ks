<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="xg" method="post">
    学生ID:<input type="text" name="sid" value=${s.sid} readonly  /></br>
    性别:<input type="text" name="gender" value=${s.gender}  /></br>
    年级ID:<input type="text" name="class_id" value=${s.class_id}   /></br>
    姓名:<input type="text" name="sname"  value=${s.sname}  /></br>
    <input type="submit" value="修改"  /></br>
</form>
</body>
</html>