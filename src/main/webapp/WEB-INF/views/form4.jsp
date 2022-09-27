<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
<h2>Podaj adres oraz termin odbioru rzeczy przez kuriera:</h2><br>
<form method="post">
    <h4>Adres odbioru</h4><br>
    <label for="street">Ulica</label>
    <input type="text" id="street" name="street"><br>
    <label for="city">Miasto</label>
    <input type="text" id="city" name="city"><br>
    <label for="zip_code">Kod pocztowy</label>
    <input type="text" id="zip_code" name="zip_code"><br>
    <label for="number">Numer telefonu</label>
    <input type="number" id="number" name="number"><br>
    <h4>Termin odbioru</h4><br>
    <label for="date">Data</label>
    <input type="date" id="date" name="date"><br>
    <label for="hour">Ulica</label>
    <input type="time" id="hour" name="hour"><br>
    <label for="comment">Uwagi dla kuriera</label>
    <input type="text" id="comment" name="comment"><br>
    <input type="button" value="Wstecz" onclick="history.back()">
    <input type="submit" value="Dalej">
</form>

<%@ include file="footer.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}resources/js/app.js"></script>
<%--<script src="<c:url value="resources/js/app.js"/>"></script>--%>
</body>
</html>