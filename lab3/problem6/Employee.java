package lab3.problem6;

public class Employee extends Person {
    private String jobName;
    private boolean hasPet;
    public Employee(String name, int age, String jobName, boolean hasPet) {
        super(name, age);
        this.jobName = jobName;
        this.hasPet = hasPet;
    }
    @Override
    public double calculateTax() {
        if (hasPet) return 0.1;
        return 0.15;
    }
    @Override
    public String getOccupation() {
        return "Employee in " + jobName;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}