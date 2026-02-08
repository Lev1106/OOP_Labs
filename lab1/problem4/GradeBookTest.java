package lab1.problem4;

import practice2.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101 Object-oriented Programming and Design",
                "This course teaches how to design software, covers concepts like classes, interfaces, inherticance, encapsulation etc",
                5,
                new String[]{"Discrete structures", "Databases"});
        Student[] students = {
                new Student("Lev", 31004),
                new Student("John", 65432),
                new Student("Test", 12345)
        };
        GradeBook gradeBook = new GradeBook(course, students);
        gradeBook.displayMessage();
        gradeBook.displayGradeReport();
    }
}
