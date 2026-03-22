package practice4.problem4;

public class Student implements Comparable<Student> {
    public String name;
    public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(gpa, student.gpa);
    }
    @Override
    public String toString() {
        return name + " " + gpa;
    }
}
