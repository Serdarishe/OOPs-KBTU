package Task4;

public class Main {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);
        double R = circuit.getResistance();


        System.out.println("Circuit information:");
        System.out.printf("Equivalent resistance = %.2f ohms%n", circuit.getResistance());

        circuit.applyPotentialDiff(12.0);

        System.out.printf("Potential difference = %.2f V%n", circuit.getPotentialDiff());
        System.out.printf("Current = %.2f A%n", circuit.getCurrent());
        System.out.printf("Power = %.2f W%n", circuit.getPower());
    }
}