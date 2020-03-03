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

<form  class="font,center" method="get" action = "addItem">
    <p class="fontCenter" >
    Name<input type="textbox"><br>
    Tier<input type="textbox"><br>
    Link<input type="textbox"><br>
        <br>
    <input type="submit" value = "Save">
    </p>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
