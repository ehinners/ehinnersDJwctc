<%--
  Created by IntelliJ IDEA.
  User: EHIN
  Date: 1/28/2020
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Home Page</title>
    <link href="../resources/css/style.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
    <header>
        <h1>
            My Snacks
        </h1>
    </header>
    <nav class="pureCenter">
        <ul>
            <li><a href="/snacks/home">Snacks</a></li>
            <li><a href="snacks/login">Login</a></li>
        </ul>
    </nav>
    <span>
        <a class="imgLink" href="/snacks/search">
            <img class="pictureCenter" src="../resources/img/Transparent%20Shopping%20Cart.png" width="50%">
        </a>
    </span>
    <p class="chunkyLink">
        <a href="/snacks/list">Browse Items</a>
    </p>
    <br>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
