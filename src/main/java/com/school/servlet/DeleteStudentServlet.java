package com.school.servlet;

import com.school.dao.StudentDAO;
import com.school.dao.StudentDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import com.school.util.DBConnection;

@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        StudentDAO dao = new StudentDAOImpl();
        dao.deleteStudent(id);

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();

            // check if table is empty
            var rs = st.executeQuery("SELECT COUNT(*) FROM students");
            rs.next();
            int count = rs.getInt(1);

            if (count == 0) {
                st.executeUpdate("ALTER TABLE students AUTO_INCREMENT = 1");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("ViewStudentServlet");
    }
}