<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<html lang="en">
<body>

<h1>Current User Name:  ${userSession.fullName}</h1>
<br>
<a href="logout">Logout</a>

</body>
</html>