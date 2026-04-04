package lab3.problem5;

import lab3.problem6.Animal;
import lab3.problem6.Dog;
import lab3.problem4.Employee;
import lab3.problem6.Person;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
                new Chocolate(50, "Twix"),
                new Chocolate(80, "Snickers"),
                new Chocolate(42, "Mars"),
                new Chocolate(67, "Bounty"),
        };
        Sort.selectionSort(chocolates);
        System.out.println(Arrays.toString(chocolates));
        Time[] times = {
                new Time(15, 30, 0),
                new Time(8, 2, 0),
                new Time(8, 50, 55),
                new Time(12, 45, 0)
        };
        Sort.bubbleSort(times);
        System.out.println(Arrays.toString(times));
        Employee[] employees = {
                new Employee("Lev", 50000, new Date(2026, 5, 7), "INS444"),
                new Employee("Alice", 55555, new Date(2000, 1, 1), "INS002"),
                new Employee("Bob", 6767, new Date(2017, 9, 9), "INS987"),
        };
        Sort.selectionSort(employees);
        System.out.println(Arrays.toString(employees));
    }
}