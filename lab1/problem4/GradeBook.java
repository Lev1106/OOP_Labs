package lab1.problem4;

import practice2.Student;

public class GradeBook {
    private Course course;
    private Student[] students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new Student[0];
    }


    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!\n\nPlease, input grades for students:", course.getName());
    }
    public void outputBarChart() {

    }
    public double determineClassAverage() {
        double average = 0;
        for (Student student : students) average += student.;
        average /= students.length();
        return average;
    }

    public void displayGradeReport() {

    }

}
