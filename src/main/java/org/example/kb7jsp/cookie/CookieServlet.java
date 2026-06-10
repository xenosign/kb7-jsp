package org.example.kb7jsp.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/setCookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 쿠키 생성
        Cookie userCookie = new Cookie("username", "tetz");

        // 쿠키 유효 기간 설정 (7일)
        userCookie.setMaxAge(60 * 60 * 24 * 7);

        // 응답에 쿠키 추가
        response.addCookie(userCookie);

        // 응답 내용 작성
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>쿠키가 설정되었습니다.</h1>");
        out.println("</body></html>");
    }
}
