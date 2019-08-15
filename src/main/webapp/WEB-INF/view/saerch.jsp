<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Михаил
  Date: 26.05.2019
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search posts by content</title>
</head>
<body>
<p>Реузультаты поиска</p>
<c:forEach var="message" items="${requestScope.searchResultList}">
    <ul>
        <li>Текст сообщения: <c:out value="${message.content}"/></li>
        <form method="post" action="<c:url value='/user/DeleteMessageServlet'/>">
            <input type="number" hidden name="id" value="${message.id}"/>
            <input type="submit" name="delete" value="Удалить"/>
        </form>

        <form method="get" action="<c:url value='/user/UpdateMessageServlet'/>">
            <input type="number" hidden name="id" value="${message.id}"/>
            <input type="submit" name="delete" value="Редактировать"/>
        </form>
    </ul>
    <hr/>

</c:forEach>
<form method="get" action="<c:url value='/user/SearchPostsByContentServlet'/>">

    <input type="submit" value="Вернуться на главную" name="Ok"><br>

</form>
</body>
</html>
