package org.example.kb7jsp.student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/student/hell")
public class StudentHellServlet extends HttpServlet {

    private static final List<String> students = List.of(
            "강태규", "권유현", "김건우", "김기선", "김민철",
            "김수현", "김현태", "송준수", "송태권", "양승환",
            "오진호", "이대주", "이민호", "이아영", "이지민",
            "이지은", "이채연", "장지연", "최규진", "최보윤",
            "홍상우", "황지원"
    );

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html><head>");
        out.println("<style>");
        out.println("ol li:nth-child(2n) { background-color: orange; }");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<h2>학생 목록 (총 " + students.size() + "명)</h2>");
        out.println("<ol>");

        for (String name : students) {
            out.println("  <li>" + name + "</li>");
        }

        out.println("</ol>");
        out.println("</body></html>");
    }
}