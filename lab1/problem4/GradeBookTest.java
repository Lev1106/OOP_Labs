package lab1.problem4;

public class GradeBookTest {
    private double temperature;
    private char scale;

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.temperature = 0;
        this.scale = scale;
    }

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public Temperature() {
        this.temperature = 0;
        this.scale = 'C';
    }
    public double temperatureInCelsius() {
        if (scale == 'C') return temperature;
        return 5 * (temperature - 32) / 9;
    }
    public double temperatureInFahrenheit() {
        if (scale == 'F') return temperature;
        return 9 * (temperature / 5) + 32;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setScale(char scale) {
        if (scale != 'C' && scale != 'F') return;
        this.scale = scale;
    }
    public void setValues(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }
    public char getScale(char scale) {
        return scale;
    }
}
