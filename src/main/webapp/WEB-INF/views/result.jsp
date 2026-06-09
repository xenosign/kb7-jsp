<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<body>
<%@ include file="/WEB-INF/includes/header.jsp" %>

<h1>결과</h1>
<h2>
  이름 : <%= request.getAttribute("name") %>
</h2>
</body>
</html>