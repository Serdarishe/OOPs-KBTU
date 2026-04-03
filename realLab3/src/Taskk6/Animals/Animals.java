package Taskk6.Animals;

import Taskk6.Interfaces.Eatable;
import java.util.Objects;

public abstract class Animals implements Comparable<Animals>, Cloneable, Eatable {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract String getSound();

    public int compareTo(Animals o) {
        return this.age - o.age;
    }

    public Object clone() {
        return this;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public String toString() {
        return getClass().getSimpleName() +
                "[name=" + name +
                ", age=" + age +
                ", sound=" + getSound() + "]";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals a = (Animals) o;
        return age == a.age && Objects.equals(name, a.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}