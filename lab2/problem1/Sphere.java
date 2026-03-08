package lab2.problem1;

public class Sphere extends Shape3D {
    private double radius;
    public Sphere(double r) {
        this.radius = r;
    }
    @Override
    public double volume() {
        return Math.PI * 4 / 3 * radius * radius * radius;
    }
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}