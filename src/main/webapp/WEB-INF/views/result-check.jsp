<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<body>
<%@ include file="/WEB-INF/includes/header.jsp" %>

<h1>결과</h1>
<h2>
  이름 : <%= request.getAttribute("name") %>
</h2>

<h1>SCOPE 확인 결과 페이지 (forward로 도달)</h1>
<h2>request 스코프</h2>
<h3> <%= request.getAttribute("reqScope") %></h3>

<h2>session 스코프</h2>
<h3> <%= session.getAttribute("sessionScope") %></h3>

<h2>application 스코프</h2>
<h3><%= getServletContext().getAttribute("appScope") %></h3>


<hr>
<h3>생명주기 실험</h3>
<%-- redirect로 이 페이지 오면 request는 죽어있어야 함 --%>
<a href="/member/check">① redirect로 check 페이지 이동 → request 확인</a><br>
</body>
</html>