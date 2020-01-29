<%--
  Created by IntelliJ IDEA.
  User: EHIN
  Date: 1/28/2020
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Item List</title>
    <link href="../css/style.css" rel="stylesheet">
</head>

<body class = "background">

<h1>
    My Snacks
</h1>
<header><a class= "login" href="http://localhost:8080/ehinnersDJwctc/resources/view/login.jsp">Login</a></header>
<form class="font" method="get" action = "addItem">
    <ul class = center>
        <li>Funyuns <a class="button" href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a  class="button"  href="">Delete</a></li>
        <li>Beef Jerky <a  class="button"  href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a  class="button"  href="">Delete</a></li>
        <li>Dr. Pepper <a  class="button"  href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a  class="button"  href="">Delete</a></li>
        <li>Cupcakes <a  class="button"  href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a  class="button"  href="">Delete</a></li>
    </ul>
</form>

</body>

</html>
