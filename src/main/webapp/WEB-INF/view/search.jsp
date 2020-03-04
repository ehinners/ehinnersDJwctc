<%--
  Created by IntelliJ IDEA.
  User: EHIN
  Date: 2/11/2020
  Time: 11:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../resources/css/style.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
    <header>
<h1>Snack Search</h1>
    </header>
<form method="get" action="../../search">
    Search by Tier
    <br>
    <input type="text" name="tier"><br/><br/>
    <input type="submit" value="Search">
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
