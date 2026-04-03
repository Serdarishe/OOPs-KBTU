package Task1.PartA;

public class Cube extends Shape3D {
    private double side;

    public Cube(double s) {
        this.side = s;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}