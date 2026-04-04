package lab3.problem1;

public abstract class Bird {
    private String name;
    private int age;
    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void eat() {
        System.out.println(name + " eats!");
    }
    public abstract void makeSound();
}
