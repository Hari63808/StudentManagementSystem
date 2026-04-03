package com.school.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.school.dao.StudentDAO;
import com.school.dao.StudentDAOImpl;
import com.school.model.Student;

@WebServlet("/UpdateStudentServlet")   // 🔥 THIS LINE FIXES 404
public class UpdateStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        StudentDAO dao = new StudentDAOImpl();
        Student s = dao.getStudentById(id);

        req.setAttribute("student", s);
        RequestDispatcher rd = req.getRequestDispatcher("update_student.jsp");
        rd.forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        Student s = new Student();
        s.setId(Integer.parseInt(req.getParameter("id")));
        s.setName(req.getParameter("name"));
        s.setEmail(req.getParameter("email"));
        s.setCourse(req.getParameter("course"));
        s.setGpa(Float.parseFloat(req.getParameter("gpa")));

        StudentDAO dao = new StudentDAOImpl();
        dao.updateStudent(s);

        res.sendRedirect("ViewStudentServlet");
    }
}