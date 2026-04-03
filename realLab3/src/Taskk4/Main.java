package Taskk4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ansar", 1000, new Date(), "111");
        Employee e2 = new Employee("Batyr", 1500, new Date(), "222");

        Manager m1 = new Manager("Kairat", 1500, new Date(), "333", 500);

        System.out.println(e1);
        System.out.println(m1);

        System.out.println(e1.compareTo(e2));

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(m1);

        Collections.sort(list, new NameComparator());
        System.out.println("Sort by name: " + list);

        Collections.sort(list, new HireDateComparator());
        System.out.println("Sort by date: " + list);

        Employee copy = (Employee) e1.clone();
        System.out.println("Clone: " + copy);
    }
}