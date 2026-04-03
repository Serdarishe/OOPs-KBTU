package lab2;

public class PProblem3 {
    public static void main(String[] args) {
        Time t = new Time(7, 7, 7);

        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = new Time(23, 7, 7);
        t.add(t2);

        System.out.println(t);
    }
}
