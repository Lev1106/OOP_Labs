package lab2.problem4;

public class Parallel extends Circuit {
    private Circuit a, b;
    private double potentialDifference;
    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getResistance() {
        return 1 / (1 / a.getResistance() + 1 / b.getResistance());
    }
    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }
    @Override
    public void applyPotentialDiff(double V) {
        potentialDifference = V;
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}