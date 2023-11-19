import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String fullName = request.getParameter("fullName");
        String password = request.getParameter("password");
        UserRegistration newUser = new UserRegistration();
        newUser.setEmail(email);
        newUser.setFullName(fullName);
        newUser.setPassword(password);

        try {
            DBUtil.createUser(newUser);
            response.sendRedirect("login.jsp");
        } catch (SQLException e) {
            throw new ServletException("Error creating user", e);
        } catch (ClassNotFoundException e) {
            throw new ServletException("Class not found", e);
        }

    }
}