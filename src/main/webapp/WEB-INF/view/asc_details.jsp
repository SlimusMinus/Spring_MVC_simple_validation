<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ASK_Details</title>
</head>
<body>
    <h2>Dear man input your details</h2>
<br>
    <form:form action="show_details" modelAttribute="employee">
        Name <form:input path="name"/>
        <form:errors path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <form:errors path="surname"/>
        <br><br>
        Salary <form:input path="salary"/>
        <form:errors path="salary"/>
        <br><br>
        <form:select path="department">
           <form:options items="${employee.departments}"/>
        </form:select>
        <br><br>
        Which car do you want
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br><br>
        Select languages
        <form:checkboxes path="languages" items="${employee.languagesList}"/>
        <br><br>
        Input number <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
        <br><br>
        Input email
        <form:input path="email"/>
        <form:errors path="email"/>
        <br><br>
        <input type="submit" value="OK">
    </form:form>
</body>
</html>
