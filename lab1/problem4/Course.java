package lab1.problem4;

public class Course {
    private String name;
    private String description;
    private int creditsNumber;
    private String[] prerequisites;

    public Course(String name) {
        this.name = name;
        this.description = "";
        this.creditsNumber = 5;
        this.prerequisites = new String[0];
    }

    public Course(String name, String description, int creditsNumber, String[] prerequisites) {
        this.name = name;
        this.description = description;
        this.creditsNumber = creditsNumber;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getCreditsNumber() {
        return creditsNumber;
    }
    public String[] getPrerequisites() {
        return prerequisites;
    }
    public String toString() {
        return name;
    }
}
