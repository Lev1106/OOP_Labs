package practice4.problem2;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {
    public double gpa;
    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }
    public void eatPizza() {
        System.out.println(name + " is eating pizza!");
    }
    public void retakeExam() {
        System.out.println(name + " retaking exam(");
    }
    public void dance() {
        System.out.println(name + " is dancing!");
    }
    public void move() {
        System.out.println(name + " is moving!");
    }
}
