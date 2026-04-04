package lab3.problem5;


public class Chocolate implements Comparable<Chocolate> {
    private double weight;
    private String name;
    public Chocolate(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Chocolate " + name + " with weight " + weight;
    }
    @Override
    public int compareTo(Chocolate chocolate) {
        return Double.compare(this.weight, chocolate.getWeight());
    }
}
