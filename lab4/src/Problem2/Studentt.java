package Problem2;

public class Studentt extends Chelovek{
    private String program;
    private int year;
    private double fee;

    public Studentt(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString(){
        return "lab2.Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
