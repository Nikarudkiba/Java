<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!-- <!DOCTYPE html> -->
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "login page" %>
</h1>
<br/>
<%--<form action="hello-servlet" method="post">--%>
<%--    <label for="uname"><b>Username</b></label>--%>
<%--    <input type="text" placeholder="Enter Username" id="uname" name="uname" required>--%>
<%--    <label for="psw"><b>Password</b></label>--%>
<%--    <input type="password" placeholder="Enter Password" id="psw" name="psw" required>--%>
<%--    <input type="submit" value="login">--%>
<%--</form>--%>
<%--<b></b>--%>
<%--<form action="hello-servlet" method="post">--%>
<%--    <input type="submit" value="Redirect">--%>
<%--</form>--%>

<%--<a href="hello-servlet">Hello Servlet</a>--%>

<form action="hello-servlet" method="post">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" id="uname" name="uname" required>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" id="psw" name="psw" required>
    <input type="submit" value="login">
</form>
<b></b>
<%--<form action="UserLoginServlet" method="post">--%>
<%--    <input type="submit" value="Redirect">--%>
<%--</form>--%>

<%--<a href="UserLoginServlet">Hello Servlet</a>--%>
</body>
</html>