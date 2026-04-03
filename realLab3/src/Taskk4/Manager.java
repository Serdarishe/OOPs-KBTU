package Taskk4;

import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, java.util.Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public double getBonus() {
        return bonus;
    }

    public String toString() {
        return super.toString() + " bonus=" + bonus;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager m = (Manager) obj;
        return bonus == m.bonus;
    }

    public int compareTo(Employee o) {
        if (this.salary != o.salary) {
            return Double.compare(this.salary, o.salary);
        }
        if (o instanceof Manager) {
            Manager m = (Manager) o;
            return Double.compare(this.bonus, m.bonus);
        }
        return 0;
    }

    public Object clone() {
        return new Manager(name, salary, hireDate, insuranceNumber, bonus);
    }
}
