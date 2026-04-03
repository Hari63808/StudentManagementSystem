<%@ page import="java.util.*,com.school.model.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Students</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/styles.css">
</head>

<body>

<div class="container">
    <h2>Student List</h2>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Course</th>
            <th>GPA</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <%
        List<Student> list = (List<Student>)request.getAttribute("students");

        for(Student s : list){
        %>

        <tr>
            <td><%=s.getId()%></td>
            <td><%=s.getName()%></td>
            <td><%=s.getEmail()%></td>
            <td><%=s.getCourse()%></td>
            <td><%=s.getGpa()%></td>

            <!-- ✅ FIXED EDIT -->
            <td>
                <a href="UpdateStudentServlet?id=<%=s.getId()%>" class="btn">Edit</a>
            </td>

            <!-- DELETE -->
            <td>
                <a href="DeleteStudentServlet?id=<%=s.getId()%>" class="btn">Delete</a>
            </td>
        </tr>

        <% } %>

    </table>

    <br>
    <a href="add_student.jsp" class="btn">Add Student</a>
</div>

</body>
</html>