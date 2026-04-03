package Task5.Animals;

public class Fish extends Animals {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Blub";
    }
}