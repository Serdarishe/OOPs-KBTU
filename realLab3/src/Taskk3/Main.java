package Taskk3;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection();

        collection.add("Car");
        collection.add("Motor");
        collection.add("Truck");

        System.out.println("Size: " + collection.size());
        System.out.println("Contains Car: " + collection.contains("Car"));

        collection.remove("Car");

        System.out.println("After remove:");
        collection.print();

        System.out.println("IsEmpty: " + collection.isEmpty());
        collection.clear();
        System.out.println("After clear: ");
        System.out.println("Size: " + collection.size());
        System.out.println("Is empty" + collection.isEmpty());
    }
}
