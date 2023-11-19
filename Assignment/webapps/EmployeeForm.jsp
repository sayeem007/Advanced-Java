<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <h1>Add Employee</h1>
    <form action="EmployeeServlet" method="POST">
        ID: <input type="text" name="id" required><br>
        Name: <input type="text" name="name" required><br>
        Date of Birth (yyyy-MM-dd): <input type="text" name="DOB" required><br>
        Email: <input type="text" name="email" required><br>
        Joining Date (yyyy-MM-dd): <input type="text" name="joinDate" required><br>
        Employee Type (OFFICER/STAFF): <input type="text" name="employeeType" required><br>
        <input type="submit" value="Add Employee">
    </form>
</body>
</html>
