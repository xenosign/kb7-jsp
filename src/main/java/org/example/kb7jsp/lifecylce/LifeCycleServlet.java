package org.example.kb7jsp.lifecylce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

    // 생성자
    public LifeCycleServlet() {
        System.out.println("1. 생성자 호출");
    }

    // 초기화
    @Override
    public void init() throws ServletException {
        System.out.println("2. init() 호출");
    }

    // GET 요청 처리
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("3. doGet() 호출");


        response.setContentType("text/plain;charset=UTF-8");
        response.getWriter().println("Hello Servlet");
    }

    // 종료
    @Override
    public void destroy() {
        System.out.println("4. destroy() 호출");
    }
}
