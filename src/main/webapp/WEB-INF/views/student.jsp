<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%
    List<String> students = (List<String>) request.getAttribute("students");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>학생 목록</title>
    <style>
        ol li:nth-child(2n) { background-color: orange; }
    </style>
</head>
<body>
<h2>강사 이름 : ${instructor} </h2>

<h2>스코프 확인</h2>
<h3>request : ${requestScope.requestData}</h3>
<h3>session : ${sessionScope.sessionData}</h3>
<h3>application : ${applicationScope.applicationData}</h3>

<a href="/student/scope">스코프 확인을 위한 링크</a><br>

<h2>학생 목록 (총 <%= students.size() %>명)</h2>
<ol>
    <% for (String name : students) { %>
    <li><%= name %></li>
    <% } %>
</ol>
</body>
</html>