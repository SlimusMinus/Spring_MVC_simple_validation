<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show_details</title>
</head>
<body>
<h2>Hello new employee</h2>
<br><br>
    Your name is ${employee.name}
<br><br>
    Your surname is ${employee.surname}
    <br><br>
    Your salary is ${employee.salary}
    <br><br>
    Your department is ${employee.department}
    <br><br>
    Your car is ${employee.carBrand}
<br><br>
    Languages is <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li> ${lang} </li>
        </c:forEach>
    </ul>
<br><br>
    Phone number is ${employee.phoneNumber}
<br><br>
    Email is ${employee.email}
</body>
</html>
