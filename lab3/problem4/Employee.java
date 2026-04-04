package lab3.problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;
    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }
    public double getSalary() {
        return salary;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setHireDate(Date date) {
        this.hireDate = date;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    @Override
    public String toString() {
        return "Employee " + getName() + " with salary " + salary + ", hired at " + hireDate + " and with insurance number " + insuranceNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;
        return e.getName().equals(getName()) && e.salary == salary && e.hireDate.equals(hireDate) && e.insuranceNumber.equals(insuranceNumber);
    }
    @Override
    public int compareTo(Employee e) {
        if (this.salary > e.getSalary()) return 1;
        if (this.salary < e.getSalary()) return -1;
        if (this instanceof Manager && e instanceof Manager) {
            return Double.compare(((Manager)this).getBonus(), ((Manager)e).getBonus());
        }
        return 0;
    }


    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        if (this.hireDate != null) employee.hireDate = (Date)this.hireDate.clone();
        return employee;
    }
}
