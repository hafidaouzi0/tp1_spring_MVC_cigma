<%--
  Created by IntelliJ IDEA.
  User: faouz
  Date: 01/04/2023
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Listing people</title>
</head>
<body>

<table>
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Age</td>
    </tr>
<c:forEach items="${people}" var="p" >
    <tr>
        <td><c:out value="${p.name}"></c:out></td>
      <td><c:out value="${p.email}}"></c:out></td>
        <td><c:out value="${p.age}}"></c:out></td>

    </tr>

</c:forEach>

</table>


</body>
</html>
