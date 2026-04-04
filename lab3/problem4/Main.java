package lab3.problem4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Employee> allEmployees = new ArrayList<>();
        Employee e1 = new Employee("Lev", 50000, new Date(2026, 1, 4), "INS321");
        Employee e2 = new Employee("John", 60000, new Date(2025, 5, 5), "INS555");
        Manager m1 = new Manager("Alice", 80000, new Date(2000, 1, 1), "INS001");
        Manager m2 = new Manager("Bob", 75000, new Date(2019, 6, 7), "INS167");
        allEmployees.add(e1);
        allEmployees.add(e2);
        allEmployees.add(m1);
        allEmployees.add(m2);
        m1.hire(e1);
        m1.hire(e2);
        for (Employee employee : allEmployees) {
            System.out.println(employee.toString());
        }
        allEmployees.sort(new NameComparator());
        for (Employee employee : allEmployees) {
            System.out.println(employee.toString());
        }
        allEmployees.sort(new HireDateComparator());
        for (Employee employee : allEmployees) {
            System.out.println(employee.toString());
        }
        try {
            Employee e1_clone = (Employee) e1.clone();
            e1_clone.setHireDate(new Date(2022, 12, 31));
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        m1.setBonus(10000);
        m2.setBonus(5000);

        System.out.println(m1.compareTo(m2));
        System.out.println(e1.equals(e2));

    }
}
