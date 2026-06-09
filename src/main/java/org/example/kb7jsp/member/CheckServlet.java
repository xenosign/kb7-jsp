package org.example.kb7jsp.member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/check")
public class CheckServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // redirect로 넘어왔으니 request 스코프는 비어있음
        // session, application은 살아있음
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/check.jsp");
        dispatcher.forward(request, response);
    }
}
