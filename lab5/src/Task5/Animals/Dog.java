package Task5.Animals;

public class Dog extends Animals {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof";
    }
}