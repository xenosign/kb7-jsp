<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <%@ include file="/WEB-INF/includes/header.jsp" %>

    <h1><%= "Hello World!" %></h1>
    <br/>
    <a href="hello-servlet">Hello Servlet</a>
    /
    <a href="loop">LOOP</a>
    /
    <a href="/member/form">FORM</a>
    /
    <a href="/setCookie">COOKIE</a>
    /
    <a href="life">LIFE</a>
    /
    <a href="/student/hell">STUDENT HELL</a>
    /
    <a href="/student/list">STUDENT MVC</a>
</body>
</html>