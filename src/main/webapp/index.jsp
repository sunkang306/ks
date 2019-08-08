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

<table border="1px">
    <tr>
        <td>学生ID</td>
        <td>性别</td>
        <td>年级ID</td>
        <td>姓名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${stu}" var="s">
        <tr>
            <td>${s.sid}</td>
            <td>${s.gender}</td>
            <td>${s.class_id}</td>
            <td>${s.sname}</td>
           <td><a href="delete?sid=${s.sid}">删除</a> <a href="add.jsp">增加</a> <a href="findone?sid=${s.sid}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>