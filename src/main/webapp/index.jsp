<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>注册</title>
</head>
<body>
<h3>注册</h3>
<form>
    身份：<input type="radio"name="identity" value="student" checked>学生
    <input type="radio" name="identity" value="teacher">教师<br>
    学号：<input type="text" name="sNo"><br>
    教号：<input type="text" name="tNo"><br>
    密码：<input type="password" name="pwd"><br>
    用户名：<input type="text" name="sName"><br>
    性别：<input type="radio" name="sex" value="男">男
    <input type="radio" name="sex" value="女">女<br>
    手机号：<input type="tel" name="tel"><br>
    地址：<input type="text"><br>
</form>

</body>
</html>
