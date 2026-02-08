package lab1.problem5;

public class Person {
    private Gender gender;
    private String name;
    private int studyYear;

    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
        this.studyYear = 1;
    }

    public Person(Gender gender, String name, int studyYear) {
        this.gender = gender;
        this.name = name;
        this.studyYear = studyYear;
    }

    public Gender getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public int getStudyYear() {
        return studyYear;
    }
}
