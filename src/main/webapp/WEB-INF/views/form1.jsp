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
<div>
<h2>
    <div>Zaznacz co chcesz oddać:</div><br>
<form method="post">
    <input type="checkbox" id="option1" name="category_g_clothes"/>
    <label for="option1">Ubrania, które nadają się do ponownego użycia</label><br>
    <input type="checkbox" id="option2" name="category_b_clothes"/>
    <label for="option2">Ubrania, do wyrzucenia</label><br>
    <input type="checkbox" id="option3" name="category_toys">
    <label for="option3">Zabawki</label>
    <input type="checkbox" id="option4" name="category_books">
    <label for="option4">Książki</label>
    <input type="checkbox" id="option5" name="category_others">
    <label for="option5">Inne</label>
    <input type="submit" value="Dalej">
</form>
</h2>
</div>

<%@ include file="footer.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}resources/js/app.js"></script>
<%--<script src="<c:url value="resources/js/app.js"/>"></script>--%>
</body>
</html>