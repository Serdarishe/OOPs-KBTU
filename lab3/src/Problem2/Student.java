package Problem2;

public class Student {
    private String name;
    private Major major;
    private int yearOfStudy;
    private double gpa;
    public static final String university = "KBTU";

    public Student(String name, Major major, int yearOfStudy, double gpa) {
        this.name = name;
        this.major = major;
        this.yearOfStudy = yearOfStudy;
        this.gpa = gpa;
    }

    public Student() {
    }


}
