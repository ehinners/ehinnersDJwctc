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
    <link href="../../resources/css/style.css" rel="stylesheet">
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
            <li><a href="">Snacks</a></li>
            <li><a href="">Login</a></li>
        </ul>
    </nav>
<form method="get" action = "addItem">

    <ul class="itemList">
        <li class="itemList">Funyuns <a class="tinyButton" href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a class="tinyButton"  href="">Delete</a></li>
        <li class="itemList">Beef Jerky <a class="tinyButton"  href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a class="tinyButton"  href="">Delete</a></li>
        <li class="itemList">Dr. Pepper <a class="tinyButton"  href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a  class="tinyButton" href="">Delete</a></li>
        <li class="itemList">Cupcakes <a  class="tinyButton"  href="http://localhost:8080/ehinnersDJwctc/resources/view/detail.jsp">Edit</a><a class="tinyButton"  href="">Delete</a></li>
    </ul>

</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
