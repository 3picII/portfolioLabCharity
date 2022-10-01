<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Document</title>

    <style>
        <%@include file="/resources/css/style.css" %>
    </style>
</head>
<body>
<%@ include file="header.jsp" %>
<h2></h2>
<h3>
    <form:form modelAttribute="user" method="post">
        <form:label path="name">Imię:</form:label>
        <form:input path="name"/><br>
        <form:label path="surname">Nazwisko:</form:label>
        <form:input path="surname"/><br>
        <form:label path="email">Email:</form:label>
        <form:input path="email"/><br>
        <form:label path="password">Hasło:</form:label>
        <form:input path="password" type="password" /><br>
        <label for="pass">Powtórz hasło:</label>
        <input name="password1" id="pass" type="password"><br>
        <input type="submit" value="Rejestruj">
    </form:form>
</h3>
<%@ include file="footer.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}resources/js/app.js"></script>
</body>
</html>