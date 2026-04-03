package Task2;

class Frog implements Jumpable {
    @Override
    public void move() {
        System.out.println("frog moves");
    }

    @Override
    public void jump() {
        System.out.println("frog jumps");
    }
}
