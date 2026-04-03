package Problem2;


import java.util.HashSet;
import java.util.Scanner;

public class Mainnn {
    public static void main(String[] args) {
        HashSet<Chelovek> people = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int choose;

        do {
            System.out.println("1.Person 2.lab2.Student 3.Staff 4.Print 0.Exit");
            choose = sc.nextInt();
            sc.nextLine();

            if (choose == 1) {
                String name = sc.nextLine();
                String address = sc.nextLine();
                people.add(new Chelovek(name, address));
            }

            if (choose == 2) {
                String name = sc.nextLine();
                String address = sc.nextLine();
                String program = sc.nextLine();
                int year = sc.nextInt();
                double fee = sc.nextDouble();
                sc.nextLine();
                people.add(new Studentt(name, address, program, year, fee));
            }

            if (choose == 3) {
                String name = sc.nextLine();
                String address = sc.nextLine();
                String school = sc.nextLine();
                double pay = sc.nextDouble();
                sc.nextLine();
                people.add(new Staff(name, address, school, pay));
            }

            if (choose == 4) {
                for (Chelovek p : people) {
                    System.out.println(p);
                }
            }

        } while (choose != 0);
    }
}
