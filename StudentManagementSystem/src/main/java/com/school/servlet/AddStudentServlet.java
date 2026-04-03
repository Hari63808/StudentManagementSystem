package com.school.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.school.dao.*;
import com.school.model.Student;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        String gpaStr = request.getParameter("gpa");

        float gpa = 0;

        if (gpaStr != null && !gpaStr.trim().isEmpty()) {
            gpa = Float.parseFloat(gpaStr);
        }

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setCourse(course);
        student.setGpa(gpa);

        StudentDAO dao = new StudentDAOImpl();
        dao.addStudent(student);

        response.sendRedirect("ViewStudentServlet");
    }
}