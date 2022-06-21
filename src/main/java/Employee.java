public class Employee {
    String firstName;
    String lastName;
    int yearOfBrth;
    String role;

    public Employee(String firstName, String lastName, int yearOfBrth, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBrth = yearOfBrth;
        this.role = role;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBrth() {
        return yearOfBrth;
    }

    public void setYearOfBrth(int yearOfBrth) {
        this.yearOfBrth = yearOfBrth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
