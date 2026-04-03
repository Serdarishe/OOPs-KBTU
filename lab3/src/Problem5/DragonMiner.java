package Problem5;

import java.util.Vector;

public class DragonMiner {
    public Vector<Person> persons = new Vector<>();

    public DragonMiner(Vector<Person> persons) {
        this.persons = persons;
    }

    public void kidnap(Person person) {
        persons.add(person);
    }

    public void willDragonEatOrNot() {
        boolean removed;
        do {
            removed = false;
            for (int i = 0; i < persons.size() - 1; i++) {
                if (persons.elementAt(i).gender == Gender.BOY && persons.elementAt(i + 1).gender == Gender.GIRL) {
                    persons.remove(i);
                    persons.remove(i);
                    removed = true;
                    break;
                }
            }
        } while (removed);
    }
}
