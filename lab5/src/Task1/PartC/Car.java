package Task1.PartC;


public class Car extends Vehicle {
    private int horsePower;

    public Car(String brand, String model, int horsePower){
        super(brand,model);
        this.horsePower = horsePower;
    }

    public int getHorsePower(){
        return horsePower;
    }

    @Override
    public String toString() {
        return "Car [Brand: " + getBrand() + ", Model: " + getModel() + ", Horsepower: " + horsePower + "]";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}