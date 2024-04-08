<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!-- <!DOCTYPE html> -->
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="hello-servlet" method="post">
    <input type="submit" value="Redirect">
    </form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>