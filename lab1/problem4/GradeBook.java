package lab1.problem4;

import practice2.Student;

import java.util.Scanner;

public class GradeBook {
    Scanner input = new Scanner(System.in);
    private Course course;
    private Student[] students;
    private int[] grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new Student[0];
        this.grades = new int[0];
    }
    public GradeBook(Course course, Student[] students) {
        this.course = course;
        this.students = students;
        this.grades = new int[students.length];
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!\n\nPlease, input grades for students:\n", course.getName());
        for (int i = 0; i < grades.length; i++) {
            while (true) {
                try {
                    System.out.printf("Student %s:  ", students[i].getName());
                    int grade = input.nextInt();
                    if (grade < 0 || grade > 100) {
                        System.out.println("Incorrect grade, must be between 0 and 100");
                        continue;
                    }
                    grades[i] = grade;
                    break;
                } catch (Exception e) {
                    System.out.printf("You entered incorrect value! Error: %s\n", e);
                    input.next();
                }
            }
        }
    }
    public void outputBarChart() {
        int[] count = new int[11];
        for (int grade : grades) {
            count[grade / 10]++;
        }
        for (int grade = 0; grade <= 100; grade += 10) {
            String s = "";
            if (grade == 0) s += "0";
            s += grade;
            if (grade < 100) {
                s += "-";
                if (grade == 0) s += "0";
                s += (grade + 9);
            }
            s += ": ";
            System.out.print(s);
            for (int i = 0; i < count[grade / 10]; i++) System.out.print("*");
            System.out.println();
        }
    }
    public double determineClassAverage() {
        if (grades.length < 1) return 0;
        double average = 0;
        for (int grade : grades) average += grade;
        average /= grades.length;
        return average;
    }

    public int determineClassLowest() {
        int lowest = 0;
        for (int i = 0; i < students.length; i++) {
            if (grades[i] < grades[lowest]) lowest = i;
        }
        return lowest;
    }

    public int determineClassHighest() {
        int highest = 0;
        for (int i = 0; i < students.length; i++) {
            if (grades[i] > grades[highest]) highest = i;
        }
        return highest;
    }

    public void displayGradeReport() {
        System.out.printf("Class average is %.2f. ", determineClassAverage());
        int lowest = determineClassLowest();
        Student lowestStudent = students[lowest];
        int lowestGrade = grades[lowest];
        System.out.printf("Lowest grade is %d (Student %s, id: %d).\n", lowestGrade, lowestStudent.getName(), lowestStudent.getId());
        int highest = determineClassHighest();
        Student highestStudent = students[highest];
        int highestGrade = grades[highest];
        System.out.printf("Highest grade is %d (Student %s, id: %d).\n\n", highestGrade, highestStudent.getName(), highestStudent.getId());
        System.out.println("Grades distribution:");
        outputBarChart();
    }
    public String toString() {
        return "Gradebook for course " + course.getName() + ", description: " + course.getDescription() + ". " + students.length + " students";
    }
}
