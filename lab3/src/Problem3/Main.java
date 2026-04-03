package Problem3;


public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(30, 'C');

        System.out.println("F: " + temperature.getTemperatureInFahrenheit());
        System.out.println("C: " + temperature.getTemperatureInCelsius());
    }
}