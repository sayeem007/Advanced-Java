import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String DOB = request.getParameter("DOB");
        String email = request.getParameter("email");
        String joinDate = request.getParameter("joinDate");
        String employeeTypeStr = request.getParameter("employeeType");

        EmployeeType employeeType = EmployeeType.valueOf(employeeTypeStr.toUpperCase());
        EmployeeGenerics<EmployeeType> newEmployee = new EmployeeGenerics<>(id, name, DOB, email, joinDate, employeeType);

        // Add the new employee to the list (you may want to use a database here)
        EmployeeInfo.getEmployeeDetails().add(newEmployee);

        response.sendRedirect("EmployeeList.jsp");
    }
}
