package Taskk4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String toString() {
        return super.toString() + " salary=" + salary;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Employee e = (Employee) obj;
        return salary == e.salary && insuranceNumber.equals(e.insuranceNumber);
    }

    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    public Object clone() {
        return new Employee(name, salary, hireDate, insuranceNumber);
    }
}