<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tweets</title>
</head>
<body>
    <h1>Tweets</h1>
    <c:forEach var="t" items="${tweets}">
        <p>Tweet ID: <c:out value="${t.id}"/></p>
        <p>Tweet poster: <c:out value="${t.poster}"/></p>
        <p>Tweet post: <c:out value="${t.post}"/></p>
        <p>Tweet date: <c:out value="${t.timestamp}"/></p>
    </c:forEach>
    <a href="index.jsp">Go back</a>
</body>
</html>