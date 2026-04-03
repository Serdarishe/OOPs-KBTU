package Taskk6.Animals;

import Taskk6.Interfaces.Playable;

public class Cat extends Animals implements Playable {
    public Cat(String name, int age) {
        super(name, age);
    }

    public String getSound() {
        return "Meow";
    }

    public void play() {
        System.out.println(getName() + " plays");
    }
}
