package lab2.problem5;

public class PhDStudent extends Student {
    private String researchTopic;
    public PhDStudent(String name, int age, String university, String researchTopic) {
        super(name, age, university);
        this.researchTopic = researchTopic;
    }
    @Override
    public String getOccupation() {
        return "PhD student at " + getUniversity() + " researching " + researchTopic;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}