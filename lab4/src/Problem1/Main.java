package Problem1;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Monkey", 2, 2);
        Dog dog = new Dog("Aqtos", 3, 4);
        dog.move();
        dog.eat();
        dog.bark();
        dog.sleep();

        Dog dog2 = new Dog("Sharik",10);
        dog2.move();
        dog2.bark();
    }
}

