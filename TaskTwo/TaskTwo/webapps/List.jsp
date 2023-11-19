<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Person List</title>
</head>
<body>

<input type="button" value="UserRegistration"
				   onclick="window.location.href='Registration.jsp'; return false;"
			/>

<table>

    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
    </tr>

    <c:forEach var="UserRegistration" items="${registration}">


        <tr>
            <td> ${UserRegistration.name} </td>
            <td> ${UserRegistration.email} </td>
            <td> ${UserRegistration.password} </td>
            <td>
                <a href="${update}">Update</a>
                 |
                <a href="${delete}"
                onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">
                Delete</a>
            </td>
        </tr>

    </c:forEach>

</table>

</body>
</html>