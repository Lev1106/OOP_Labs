package lab1.problem1;

public class Data {
    private double average;
    private double maximum;
    private int size;

    public Data() {
        this.average = 0;
        this.maximum = -2e9;
        this.size = 0;
    }

    public void addValue(double value) {
        average *= size;
        average += value;
        size++;
        average /= size;
        if (value > maximum) maximum = value;
    }
    public double getAverage() {
        return average;
    }
    public double getMaximum() {
        return maximum;
    }
}
