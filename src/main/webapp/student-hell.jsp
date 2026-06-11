<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%
  List<String> students = List.of(
          "강태규", "권유현", "김건우", "김기선", "김민철",
          "김수현", "김현태", "송준수", "송태권", "양승환",
          "오진호", "이대주", "이민호", "이아영", "이지민",
          "이지은", "이채연", "장지연", "최규진", "최보윤",
          "홍상우", "황지원"
  );
  request.setAttribute("students", students);
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
<h2>학생 목록 (총 <%= students.size() %>명)</h2>
<ol>
  <% for (String name : students) { %>
  <li><%= name %></li>
  <% } %>
</ol>
</body>
</html>