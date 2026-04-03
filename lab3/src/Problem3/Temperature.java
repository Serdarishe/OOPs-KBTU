package Problem3;

public class Temperature {

    private double temperature;
    private char unit;



    public Temperature(double temperature, char unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public double getTemperatureInCelsius() {
        if (unit == 'C') return temperature;
        return 5 * (temperature - 32) / 9;
    }

    public double getTemperatureInFahrenheit() {
        if (unit == 'F') return temperature;
        return 9 * (temperature / 5) + 32;
    }

}