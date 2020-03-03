<%--
  Created by IntelliJ IDEA.
  User: EHIN
  Date: 1/28/2020
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Home Page</title>
    <link rel="stylesheet" href="../../resources/css/style.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
    <header>
        <h1>
            Login to the Snack Registry
        </h1>
    </header>

        <nav>
            <ul>
                <li><a href="">Snacks</a></li>
                <li><a href="">Home</a></li>
            </ul>
        </nav>

        <form method="get" action = "login">
            <p class="fontCenter" >
            Username<input type="textbox"><br>
            Password<input type="textbox"><br>
                <br>
            <input type="submit" value = "Login">
            </p>
        </form>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
