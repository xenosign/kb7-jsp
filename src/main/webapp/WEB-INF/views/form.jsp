<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<%@ include file="/WEB-INF/includes/header.jsp" %>
<h2>회원 등록</h2>

<form action="/member/submit" method="post">
  이름 : <input type="text" name="name">

  <button type="submit">전송</button>
</form>

</body>
</html>