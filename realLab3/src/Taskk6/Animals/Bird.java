package Taskk6.Animals;

import Taskk6.Interfaces.Playable;

public class Bird extends Animals implements Playable {
    public Bird(String name, int age) {
        super(name, age);
    }

    public String getSound() {
        return "Tweet";
    }

    public void play() {
        System.out.println(getName() + " plays");
    }
}
