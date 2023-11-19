public class UserRegistration {

    private String fullName;
    private String email;
    private String password;

    public UserRegistration() {

    }

    public UserRegistration(String fullName,String email, String password) {

        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "email='" + email + '\'' +
                ", name='" + fullName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
