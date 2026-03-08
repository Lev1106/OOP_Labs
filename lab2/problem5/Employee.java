package lab2.problem5;

public class Employee extends Person {
    private String jobName;
    public Employee(String name, int age, String jobName) {
        super(name, age);
        this.jobName = jobName;
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