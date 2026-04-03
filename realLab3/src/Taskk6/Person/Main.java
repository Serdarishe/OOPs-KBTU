package Taskk6.Person;

import Taskk6.Animals.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Student("Boris", 20, "Math");
        Person p2 = new Employee("Zhasik", 30, "Engineer");
        Person p3 = new PhDStudent("Alina", 26, "CS", "AI");

        Cat cat = new Cat("Murka", 5);
        Dog dog = new Dog("Rex", 3);
        Animals bird = new Bird("Rio", 2);
        Animals fish = new Fish("Nemo", 1);

        System.out.println("=== TEST EAT ===");
        p1.eat();
        cat.eat();

        System.out.println("\n=== TEST PLAY ===");
        dog.play();
        cat.play();

        System.out.println("\n=== TEST COMPARE ===");
        System.out.println(p1.compareTo(p2));
        System.out.println(cat.compareTo(dog));

        System.out.println("\n=== TEST PET ASSIGN ===");
        p1.assignPet(cat);
        p2.assignPet(dog);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n=== TEST TRANSFER PET ===");
        p1.leavePetWith(p3);
        System.out.println(p1);
        System.out.println(p3);

        p1.retrievePetFrom(p3);
        System.out.println(p1);
        System.out.println(p3);

        System.out.println("\n=== TEST CLONE ===");
        Person copy = (Person) p1.clone();
        System.out.println(copy);

    }
}