package Task5.Person;

import Task5.Animals.*;

public class Main {
    public static void main(String[] args) {
        Person zhasik = new Employee("Zhasik", 30, "Engineer");
        Person alina = new PhDStudent("Alina", 26, "Computer Science", "AI");
        Person boris = new Student("Boris", 20, "Mathematics");

        Animals murka = new Cat("Murka", 5);
        Animals rex = new Dog("Rex", 3);
        Animals rio = new Bird("Rio", 2);
        Animals nemo = new Fish("Nemo", 1);

        zhasik.assignPet(murka);
        boris.assignPet(rio);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(zhasik);
        registry.addPerson(alina);
        registry.addPerson(boris);

        System.out.println("Initial state:");
        System.out.println(registry);

        zhasik.leavePetWith(alina);
        System.out.println("After Zhasik leaves pet with Alina:");
        System.out.println(registry);

        zhasik.retrievePetFrom(alina);
        System.out.println("After Zhasik retrieves pet from Alina:");
        System.out.println(registry);

        alina.assignPet(rex);
        System.out.println("After trying to assign Dog to PhDStudent:");
        System.out.println(registry);

        alina.assignPet(nemo);
        System.out.println("After assigning Fish to PhDStudent:");
        System.out.println(registry);


    }

}