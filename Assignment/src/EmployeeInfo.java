import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {
    private static List<EmployeeGenerics<EmployeeType>> employeeDetails = new ArrayList<>();

    public static List<EmployeeGenerics<EmployeeType>> getEmployeeDetails() {
        return employeeDetails;
    }
}
