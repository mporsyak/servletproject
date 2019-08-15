<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Messege</title>
</head>
<body>
<form method="post" action="<c:url value='/user/AddMessageServlet'/>">
    <h2>Введите сообщение</h2><br/>
    <input type="text" name="content"></input>
    <input type="submit" value="Ok" name="Ok"><br>
</form>
<form method="post" action="<c:url value='/user/SearchPostsByContentServlet'/>">
    <h2>Найти сообщение</h2>
    <p>Введите текст сообщения</p>
    <input type="text" name="content"></input>
    <input type="submit" value="Поиск" name="Ok"><br>
</form>
<form method="post" action="<c:url value='/logout'/>">
    <%--<input type="text" name="content"></input>--%>
    <input type="submit" value="Выход" name="Ok"><br>
</form>

<h2>Все сообщения</h2><br/>

<c:forEach var="message" items="${requestScope.messages}">
    <ul>
        <li>Текст сообщения: <c:out value="${message.content}"/></li>
        <form method="post" action="<c:url value='/user/DeleteMessageServlet'/>">
            <input type="number" hidden name="id" value="${message.id}"/>
            <input type="submit" name="delete" value="Удалить"/>
        </form>

        <a href="/user/UpdateMessageServlet/?id=${message.id}"><button>Редактировать</button></a>
          <%--< method="get" action="<c:url value='/user/UpdateMessageServlet'/>">--%>
            <%--<input type="number" hidden name="id" value="${message.id}"/>--%>
            <%--<input type="submit" name="delete" value="Редактировать"/>--%>
        <%--</a>--%>
    </ul>
    <hr/>

</c:forEach>


</body>
</html>
