<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="appRoot" value="${appRoot.request.contextPath}"/>
<html>
<head>
    <title>Snacks</title>
    <link href="../resources/css/style.css" rel="stylesheet">
    <base href="${pageContext.request.contextPath}/"/>
</head>
<body>
<table>
    <tr>
        <th>Name<th>
        <th>Flavor<th>
        <th>Description<th>
        <th>Type<th>
        <th>ID<th>
        <th>Times Ordered<th>
        <th>Tier<th>
        <th>Servings<th>
    </tr>
    <c:forEach var="snack" items="${snacks}">
        <tr>
            <td>${snack.snackName}</td>
            <td>${snack.flavorProfile}</td>
            <td>${snack.description}</td>
            <td>${snack.snackType}</td>
            <td>${snack.snackID}</td>
            <td>${snack.timesOrdered}</td>
            <td>${snack.tier}</td>
            <td>${snack.servings}</td>
        </tr>
    </c:forEach>
</table>
<!-- see base tag in head -->
<a href="${appRoot}/index.jsp">Home</a>
</body>
</html>
