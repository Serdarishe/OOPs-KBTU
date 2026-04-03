package Task1.PartA;

public class Main {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(5, 10);
        Shape3D sphere = new Sphere(5);
        Shape3D cube = new Cube(5);

        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Sphere Volume: " + sphere.volume());
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube SurfaceArea: " + cube.surfaceArea());
    }
}