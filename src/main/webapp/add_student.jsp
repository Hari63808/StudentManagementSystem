<!DOCTYPE html>
<html>
<head>
    <title>Add Student</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/styles.css">
</head>

<body>

<div class="form-box">
    <h2>Add Student</h2>

    <form action="AddStudentServlet" method="post">

        <div class="field">
            <label>Name</label>
            <input type="text" name="name">
        </div>

        <div class="field">
            <label>Email</label>
            <input type="text" name="email">
        </div>

        <div class="field">
            <label>Course</label>
            <input type="text" name="course">
        </div>

        <div class="field">
            <label>GPA</label>
            <input type="text" name="gpa">
        </div>

        <button type="submit">Add Student</button>
    </form>

    <a href="ViewStudentServlet">Back</a>
</div>

</body>
</html>