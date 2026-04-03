package Task2;

class Human implements Jumpable {
    @Override
    public void move() {
        System.out.println("human moves to a rock");
    }

    @Override
    public void jump() {
        System.out.println("human jumps over a rock");
    }
}
