package lab2.problem5;

public class Student extends Person {
    private String university;
    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    @Override
    public String getOccupation() {
        return "Student at " + university;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}