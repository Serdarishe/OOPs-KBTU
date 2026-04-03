package Problem5;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Vector<Person> persons = new Vector<>();

        for(char ch : s.toCharArray()) {
            if(ch == 'B' || ch =='b') {
                persons.add(new Person(Gender.BOY));
            } else {
                persons.add(new Person(Gender.GIRL));
            }
        }

        DragonMiner dragonminer = new DragonMiner(persons);
        dragonminer.willDragonEatOrNot();

        dragonminer.persons.forEach(System.out::println);
    }
}
