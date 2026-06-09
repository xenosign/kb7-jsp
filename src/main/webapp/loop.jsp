<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="/WEB-INF/includes/header.jsp" %>
<% int max = 10; %>
<p>총 <%= max %> 번 반복</p>
<ul>
    <% for (int i = 1; i <= max; i++) { %>
    <li><%= i %> 번째 반복 중</li>
    <% } %>
</ul>
</body>
</html>