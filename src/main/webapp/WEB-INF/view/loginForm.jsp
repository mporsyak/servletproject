<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authentication</title>
</head>
<body>
<%--<p> <c:out value="${info}"/></p>--%>

<form method="post" action="/user/content">
    <h2>Войти</h2><br/>
    <input type="text" name="login"></input><br>
    <input type="text" name="password"></input><br>
    <input type="submit" value="Вход" name="Ok"><br>
</form>




</body>
</html>

