package Taskk6.Animals;

import Taskk6.Interfaces.Playable;

public class Dog extends Animals implements Playable {
    public Dog(String name, int age) {
        super(name, age);
    }

    public String getSound() {
        return "Woof";
    }

    public void play() {
        System.out.println(getName() + " plays");
    }
}