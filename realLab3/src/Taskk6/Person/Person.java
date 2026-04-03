package Taskk6.Person;

import Taskk6.Animals.Animals;
import Taskk6.Interfaces.Eatable;

import java.util.Objects;

public abstract class Person implements Comparable<Person>, Cloneable, Eatable {
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
        if (pet == null) return;
        if (hasPet()) return;
        if (!canTakePet(pet)) return;
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public void leavePetWith(Person other) {
        if (!hasPet() || other == null) return;
        if (other.hasPet()) return;
        if (!other.canTakePet(this.pet)) return;

        other.pet = this.pet;
        this.vacationPet = this.pet;
        this.pet = null;
    }

    public void retrievePetFrom(Person other) {
        if (other == null) return;
        if (this.hasPet()) return;
        if (vacationPet == null) return;
        if (other.pet == null || !other.pet.equals(vacationPet)) return;

        this.pet = other.pet;
        other.pet = null;
        this.vacationPet = null;
    }

    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public Object clone() {
        return this;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public abstract String getOccupation();

    public String toString() {
        return getClass().getSimpleName() +
                "[name=" + name +
                ", age=" + age +
                ", occupation=" + getOccupation() +
                ", pet=" + (pet == null ? "no pet" : pet.toString()) +
                "]";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return age == p.age && Objects.equals(name, p.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
