package org.example.kb7jsp.member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/member/submit")
public class SubmitServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        request.setAttribute("name", name);

        // 생명 주기 추가
        // ① request 스코프
        request.setAttribute("reqScope", "request에 저장된 값 - forward 시에만 살아있음");

        // ② session 스코프
        request.getSession().setAttribute("sessionScope", "session에 저장된 값 - 브라우저 닫을 때까지");

        // ③ application 스코프
        getServletContext().setAttribute("appScope", "application에 저장된 값 - 서버 재시작 전까지");





        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/result.jsp");
        dispatcher.forward(request, response);

//        // jsp 적용 안된 버전
//        response.sendRedirect(
//                "/member/result?name=" +
//                        URLEncoder.encode(name, "UTF-8"));
    }
}
