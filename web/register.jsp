<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/18
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>员工注册界面</h1>
<form action="register" method="post">
    <label >
        用户名：<input type="text" name="name" placeholder="请输入用户名">
    </label><br>
    <label >
        密码： <input type="text" name="password" placeholder="请输入密码">
    </label><br>
    <label >
        部门名称: <input type="text" name="department" placeholder="请输入部门名称">
    </label>
    <input type="submit" value="注册">
</form>
</body>
</html>
