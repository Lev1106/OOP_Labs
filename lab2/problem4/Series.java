package lab2.problem4;

public class Series extends Circuit {
    private Circuit a, b;
    private double potentialDifference;
    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }
    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }
    @Override
    public void applyPotentialDiff(double V) {
        potentialDifference = V;
        double I = getCurrent();
        double potertialDiffA = I * a.getResistance(), potertialDiffB = I * b.getResistance();
        a.applyPotentialDiff(potertialDiffA);
        b.applyPotentialDiff(potertialDiffB);
    }
}