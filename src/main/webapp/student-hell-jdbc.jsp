<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %>
<%
  List<String> students = new ArrayList<>();
  String errorMessage = null;

  String url = "jdbc:mysql://localhost:3306/kb7jsp";
  String user = "root";
  String password = "1234";
  String sql = "SELECT name FROM student ORDER BY name";

  try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

      while (rs.next()) {
        students.add(rs.getString("name"));
      }

    }
  } catch (ClassNotFoundException e) {
    errorMessage = "JDBC 드라이버를 찾을 수 없습니다.";
  } catch (SQLException e) {
    errorMessage = "DB 조회 중 오류가 발생했습니다: " + e.getMessage();
  }

  request.setAttribute("students", students);
%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>학생 목록</title>
</head>
<body>

<h2>학생 목록</h2>
<% if (errorMessage != null) { %>
<div class="error-box">
  ⚠️ <%= errorMessage %>
</div>
<% } else if (students.isEmpty()) { %>
<div class="empty-box">
  📭 조회된 학생이 없습니다.
</div>
<% } else { %>
<h2>학생 목록 (총 <%= students.size() %>명)</h2>
<ol>
  <%
    int i = 0;
    do {
  %>
  <li><%= students.get(i) %></li>
  <%
      i++;
    } while (i < students.size());
  %>
</ol>
<% } %>

</body>
</html>