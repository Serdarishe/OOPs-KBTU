package Task5.Person;

import java.util.Objects;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String getOccupation() {
        return "Employee: " + jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + ", jobTitle=" + jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(jobTitle, employee.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jobTitle);
    }
}