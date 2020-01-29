<%--
  Created by IntelliJ IDEA.
  User: EHIN
  Date: 1/28/2020
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Item Detail</title>
    <link href="../css/style.css" rel="stylesheet">
</head>

<body class="background">

<h1>
    My Snacks
</h1>
<header><a class= "login"  href="http://localhost:8080/ehinnersDJwctc/resources/view/login.jsp">Login</a></header>
<form  class="font,center" method="get" action = "addItem">
    Snack<input type="textbox"><br>
    Tier<input type="textbox"><br>
    Buy-Link<input type="textbox"><br>
    <input type="submit" value = "Save">
</form>

</body>

</html>
