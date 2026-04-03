package Task5.Animals;

public class Bird extends Animals {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Tweet";
    }
}