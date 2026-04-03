package Problem2;

public class Chelovek {
    private String name;
    private String address;

    public Chelovek(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Adam [name=" + name + ", address=" + address + "]";
    }
}
