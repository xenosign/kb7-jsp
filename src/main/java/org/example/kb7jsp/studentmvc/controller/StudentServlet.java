package org.example.kb7jsp.studentmvc.controller;

import org.example.kb7jsp.studentmvc.model.StudentDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/student/list")
public class StudentServlet extends HttpServlet {
    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<String> students = studentDao.findAll();

        req.setAttribute("students", students);
        req.setAttribute("instructor", null);

        // 1. request 스코프
        req.setAttribute("requestData", "request에 저장된 값");

        // 2. session 스코프
        req.getSession().setAttribute("sessionData", "session에 저장된 값");

        // 3. application 스코프
        getServletContext().setAttribute("applicationData", "application에 저장된 값");

        req.getRequestDispatcher("/WEB-INF/views/student-jstl.jsp").forward(req, resp);
    }
}
