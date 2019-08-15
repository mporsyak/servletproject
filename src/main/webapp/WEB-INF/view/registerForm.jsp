<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/adduser">
    <h2>Регистрация</h2><br/>
    <input type="text" name="login"></input><br>
    <input type="text" name="password"></input><br>
    <input type="submit" value="Регистрация" name="Ok"><br>
</form>
</body>
</html>
