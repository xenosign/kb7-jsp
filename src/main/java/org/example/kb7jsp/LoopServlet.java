package org.example.kb7jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loop-servlet")
public class LoopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int max = 10;
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Title</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>총 " + max + " 번 반복</p>");
        out.println("<ul>");

        for (int i = 1; i <= max; i++) {
            out.println("<li>" + i + " 번째 반복 중</li>");
        }

        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}