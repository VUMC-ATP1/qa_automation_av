import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {
    @Test
    public void testEverything() {
        Employee emp1 = new Employee("John", "Doe", 1969, "Manager");
        Assert.assertEquals(emp1.getFirstName(), "John");
        Assert.assertEquals(emp1.getLastName(), "Doe");
        Assert.assertEquals(emp1.getYearOfBrth(), 1969);
        Assert.assertEquals(emp1.getRole(), "Manager");
    }

    @Test
    public void testEachGetter() {
        Employee emp2 = new Employee();
        emp2.setFirstName("Jane");
        emp2.setLastName("Doe");
        emp2.setYearOfBrth(1971);
        emp2.setRole("Janitor");
        Assert.assertEquals(emp2.getFirstName(), "Jane");
        Assert.assertEquals(emp2.getLastName(), "Doe");
        Assert.assertEquals(emp2.getYearOfBrth(), 1971);
        Assert.assertEquals(emp2.getRole(), "Janitor");
    }

}
