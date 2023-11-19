import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String DOB = request.getParameter("DOB");
            String email = request.getParameter("email");
            String joinDate = request.getParameter("joinDate");
            String employeeTypeStr = request.getParameter("employeeType");

            // Validate and parse date strings
            LocalDate parsedDOB = LocalDate.parse(DOB);
            LocalDate parsedJoinDate = LocalDate.parse(joinDate);

            // Validate employee type
            EmployeeType employeeType = EmployeeType.valueOf(employeeTypeStr.toUpperCase());

            // Create a new employee
            EmployeeGenerics<EmployeeType> newEmployee = new EmployeeGenerics<>(id, name, parsedDOB.toString(), email, parsedJoinDate.toString(), employeeType);

            // Add the new employee to the list (you may want to use a database here)
            EmployeeInfo.getEmployeeDetails().add(newEmployee);

            response.sendRedirect("EmployeeList.jsp");
        } catch (Exception e) {
            // Handle exceptions (e.g., invalid input)
            e.printStackTrace(); // Log the exception for debugging
            response.sendRedirect("error.jsp"); // Redirect to an error page
        }
    }

}
