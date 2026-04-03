package Task1.PartC;

public class Vehicle {
    private String brand;
    private String  model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle [Brand: " + getBrand() + ",Model: " + getModel() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return brand.equals(vehicle.brand) && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + model.hashCode();
    }
}
