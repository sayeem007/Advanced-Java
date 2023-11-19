import java.time.LocalDate;

public class EmployeeGenerics<T> {
    private int id;
    private String name;
    private LocalDate DOB;
    private String email;
    private LocalDate joinDate;
    private T employeeType;

    public EmployeeGenerics(int id, String name, String DOB, String email, String joinDate, EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.DOB = LocalDate.parse(DOB);
        this.email = email;
        this.joinDate = LocalDate.parse(joinDate);
        this.employeeType = (T) employeeType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public T getEmployeeType() {
        return employeeType;
    }
}
