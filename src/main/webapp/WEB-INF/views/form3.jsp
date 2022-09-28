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
<h2>
<form:form modelAttribute="institution" method="post" action="form3">
    <form:select path="name" items="${institutions}">
<%--        <form:options items="${institutions}"/>--%>
    </form:select>
    <input type="button" value="Wstecz" onclick="history.back()">
    <input type="submit" value="Dalej">
    </form:form>
</h2>

<%@ include file="footer.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}resources/js/app.js"></script>
<%--<script src="<c:url value="resources/js/app.js"/>"></script>--%>
</body>
</html>