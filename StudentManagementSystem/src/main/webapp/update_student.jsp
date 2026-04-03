<%@ page import="com.school.model.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/styles.css">
</head>

<body>

<div class="form-box">

<%
Student s = (Student)request.getAttribute("student");
%>

<h2>Update Student</h2>

<form action="UpdateStudentServlet" method="post">

    <input type="hidden" name="id" value="<%=s.getId()%>">

    <div class="field">
        <label>Name</label>
        <input type="text" name="name" value="<%=s.getName()%>">
    </div>

    <div class="field">
        <label>Email</label>
        <input type="text" name="email" value="<%=s.getEmail()%>">
    </div>

    <div class="field">
        <label>Course</label>
        <input type="text" name="course" value="<%=s.getCourse()%>">
    </div>

    <div class="field">
        <label>GPA</label>
        <input type="text" name="gpa" value="<%=s.getGpa()%>">
    </div>

    <button type="submit">Update Student</button>

</form>

</div>

</body>
</html>