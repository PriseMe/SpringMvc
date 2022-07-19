<%--
  Created by IntelliJ IDEA.
  User: 27151
  Date: 2022/6/11
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>肖洋的登录页面</title></head>
<body>
${sessionScope.message}<br>
<form action="/CheckUserServlet" method="post">
    请输入用户名和密码：<br>
    用户名：<input type="text" name="username"/><br>
    密    码：<input type="password" name="password"/><br>
    <input type="checkbox" name="check" value="check"/>自动登录<br>
    <input type="submit" value="提交"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>
