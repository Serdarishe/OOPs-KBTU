package lab2;

public class StarTriangle {
    private int width;
    public StarTriangle(int width){this.width = width;}

    @Override
    public String toString() {
        String s = "";
        for(int i =1; i <= width; i++){
            s += "[*]".repeat(i);
            s += "\n";
        }
        return s;
    }
}
