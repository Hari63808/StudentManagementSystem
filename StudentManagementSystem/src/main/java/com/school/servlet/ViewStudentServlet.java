package com.school.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.school.dao.StudentDAO;
import com.school.dao.StudentDAOImpl;
import com.school.model.Student;

@WebServlet("/ViewStudentServlet")
public class ViewStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        StudentDAO dao = new StudentDAOImpl();

        List<Student> students = dao.getAllStudents();

        request.setAttribute("students", students);

        RequestDispatcher rd = request.getRequestDispatcher("view_students.jsp");
        rd.forward(request, response);
    }
}