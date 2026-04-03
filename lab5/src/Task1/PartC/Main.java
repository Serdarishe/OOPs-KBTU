package Task1.PartC;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota","Corolla");
        Vehicle vehicle2 = new Vehicle("Toyota","Corolla");
        Car car1 = new Car("BMW","X5",300);
        Car car2 = new Car("Mercedes","Benz",250);

        System.out.println("vehicle1 equals vehicle2: " + vehicle1.equals(vehicle2));
        System.out.println("car1 equals car2: " + car1.equals(car2));

        HashSet<Vehicle> vehicles = new HashSet<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(car1);
        vehicles.add(car2);

        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

    }
}
