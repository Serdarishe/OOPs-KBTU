package Task5.Person;
import Task5.Animals.Animals;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animals pet;
    private Animals vacationPet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animals getPet() {
        return pet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public boolean canTakePet(Animals pet) {
        return true;
    }

    public void assignPet(Animals pet) {
        if (pet == null) {
            System.out.println(name + " cannot take a null pet.");
            return;
        }
        if (hasPet()) {
            System.out.println(name + " already has a pet.");
            return;
        }
        if (!canTakePet(pet)) {
            System.out.println(name + " cannot take this pet.");
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public void leavePetWith(Person other) {
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }
        if (other == null) {
            System.out.println("Caretaker is null.");
            return;
        }
        if (other.hasPet()) {
            System.out.println(other.getName() + " already has a pet.");
            return;
        }
        if (!other.canTakePet(this.pet)) {
            System.out.println(other.getName() + " cannot take this pet.");
            return;
        }

        other.pet = this.pet;
        this.vacationPet = this.pet;
        this.pet = null;
    }

    public void retrievePetFrom(Person other) {
        if (other == null) {
            System.out.println("Caretaker is null.");
            return;
        }
        if (this.hasPet()) {
            System.out.println(name + " already has a pet.");
            return;
        }
        if (vacationPet == null) {
            System.out.println(name + " has no pet to retrieve.");
            return;
        }
        if (other.pet == null || !other.pet.equals(vacationPet)) {
            System.out.println(other.getName() + " is not keeping " + name + "'s pet.");
            return;
        }

        this.pet = other.pet;
        other.pet = null;
        this.vacationPet = null;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "[name=" + name +
                ", age=" + age +
                ", occupation=" + getOccupation() +
                ", pet=" + (pet == null ? "no pet" : pet.toString()) +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
