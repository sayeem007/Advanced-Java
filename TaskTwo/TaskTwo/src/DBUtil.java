import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

    public static List<UserRegistration> getAll() throws SQLException, ClassNotFoundException {
        List<UserRegistration> userRegistrations = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT fullName, email, password FROM users");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                userRegistrations.add(new UserRegistration(
                        resultSet.getString("fullName"),
                        resultSet.getString("email"),
                        resultSet.getString("password")));
            }
        }
        return userRegistrations;
    }

    public static void createUser(UserRegistration userRegistration) throws SQLException, ClassNotFoundException {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (fullName, email, password) VALUES (?, ?, ?)")) {

            preparedStatement.setString(1, userRegistration.getFullName());
            preparedStatement.setString(2, userRegistration.getEmail());
            preparedStatement.setString(3, userRegistration.getPassword());
            preparedStatement.executeUpdate();
        }
    }

    public static void update(UserRegistration userRegistration) {
        // Implement update logic here
    }

    public static void delete(int id) {
        // Implement delete logic here
    }
}
