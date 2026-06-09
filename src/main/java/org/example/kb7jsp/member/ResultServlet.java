package org.example.kb7jsp.member;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/result")
public class ResultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println("<h1>결과</h1>");

        response.getWriter().println("<h2>이름 : " + name + "</h2>");
    }
}
