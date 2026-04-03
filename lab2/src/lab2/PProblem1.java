package lab2;

public class PProblem1 {
    public static void main(String[] args){
        Student std = new Student("Serdar","24B031016",2);

        std.setId("24B031016");
        std.setName("Serdar");
        std.setYearOfStudy(2);

        System.out.println(std.getId());
        System.out.println(std.getName());
        System.out.println(std.getYearOfStudy());
        std.incrementYearOfStudy();
        System.out.println(std.getYearOfStudy());

    }
}
