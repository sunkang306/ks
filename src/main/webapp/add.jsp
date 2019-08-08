<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
<form action="add" method="post">
    学生ID:<input type="text" name="sid" /></br>
    性别:<input type="text" name="gender" /></br>
    年级ID:<input type="text" name="class_id" /></br>
    姓名:<input type="text" name="sname" /></br>
    <input type="submit" value="添加" /></br>
</form>
</body>
</html>