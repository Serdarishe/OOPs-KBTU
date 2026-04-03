package Task5.Animals;

public class Cat extends Animals {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Meow";
    }
}