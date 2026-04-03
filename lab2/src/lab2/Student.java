package lab2;

public class Student {
    private String id;
    private String name;
    private int yearOfStudy;


    public Student(String name, String id,int yearOfStudy) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
    }
    public void incrementYearOfStudy(){
        this.yearOfStudy++;
    }
    public Student(){}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
