package practice4.problem2;

import practice4.problem4.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cat cat = new Cat("Barsik", "Persian");
        Student student = new Student("Lev", 19, 3.65);
        student.retakeExam();
        student.dance();
        student.move();
        restaurant.servePizza(cat);
        restaurant.servePizza(student);
    }
}
