package practice3;

public class Animal {
    private final String name;
    private final String type;
    private final int age;
    private final String color;

    public Animal(String name, String type, int age, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
    }
    public String info() {
        return "Animal " + type + ", named " + name + ", " + age + " years old, " + color + " colored";
    }
}
