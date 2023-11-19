<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<body>

<form action="Registration" method="POST">

    <label>Full Name:</label>
    <input type="text" name="fullName" required><br><br>

    <label>Email:</label>
    <input type="text" name="email" required><br><br>

    <label>Password:</label>
    <input type="password" name="password" required><br><br>

    <input type="submit" value="Register">
</form>

</body>
</html>