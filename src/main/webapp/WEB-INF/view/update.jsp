<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Message</title>
</head>
<body>


<form method="get" action="<c:url value='/user/UpdateMessageServlet'/>">

    <label>Редактировать сообщение:
    <input type="text" name="content" value = "${requestScope.message.content}"/></label><br>

    <input type="number" hidden name="id" value="${requestScope.message.id}"/>

    <input type="submit" value="Ok" name="Ok"><br>
</form>
</body>
</html>
