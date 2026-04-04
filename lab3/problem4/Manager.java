package lab3.problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> employees;
    private double bonus;
    public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name, salary, hireDate, insuranceNumber);
        this.employees = new Vector<>();
        this.bonus = 0;
    }
    public Manager(String name, double salary, Date hireDate, String insuranceNumber, Vector<Employee> employees, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.employees = employees;
        this.bonus = bonus;
    }
    public void hire(Employee e) {
        employees.add(e);
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return "Manager " + getName() + " with salary " + getSalary() + ", hired at " + getHireDate() + ". with insurance number " + getInsuranceNumber() + " and has bonus " + getBonus();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Manager e = (Manager) obj;
        return e.getName().equals(getName()) && e.getSalary() == getSalary() && e.getHireDate().equals(getHireDate()) &&
                e.getInsuranceNumber().equals(getInsuranceNumber()) && e.getBonus() == bonus;
    }


    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager manager = (Manager) super.clone();
        return manager;
    }
}
