<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/18
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>员工登录界面</h1>
    <form action="login" method="post">
        <label >
            用户名：<input type="text" name="name" placeholder="请输入用户名">
        </label><br>
        <label >
            密码： <input type="text" name="password" placeholder="请输入密码">
        </label><br>
        <input type="submit" value="登录"> <input type="button" value="注册" onclick="register()">
    </form>
    <p style="color: red">${error}</p>
<script>
    function register() {
        location.href="register";
    }
</script>
</body>
</html>
