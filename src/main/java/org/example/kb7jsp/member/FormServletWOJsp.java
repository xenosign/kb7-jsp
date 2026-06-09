package org.example.kb7jsp.member;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServletWOJsp extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        // header.jsp 역할
        out.println("<header>");
        out.println("<h1>KB7 JSP 예제</h1>");
        out.println("</header>");

        out.println("<h2>회원 등록</h2>");

        out.println("<form action=\"/member/submit\" method=\"post\">");
        out.println("이름 : <input type=\"text\" name=\"name\">");
        out.println("<button type=\"submit\">전송</button>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
}
