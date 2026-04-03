package Problem1;

public class Dog extends Animal{
        public Dog () {
            super();
        }

        public Dog(String type) {
            super(type, 0, 4);
        }

        public Dog(String type, int age) {
            super(type, age, 4);
        }

        public Dog(String type, int age, int numberOfLegs) {
            super(type, age, numberOfLegs);
        }

        @Override
        public void move() {
            System.out.println(type + " " + "is moving");
        }

        @Override
        public void eat() {
            System.out.println(type + " " +"is eating");
        }

        public void bark() {
            System.out.println("Bark");
        }
    }

