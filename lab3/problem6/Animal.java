package lab3.problem6;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public abstract class Animal implements Comparable<Animal>, Trainable, Serializable {
    private String name;
    private int age;
    private Set<String> commands = new HashSet<>();
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract String getSound();

    @Override
    public void learnCommand(String command) {
        commands.add(command);
    }
    @Override
    public boolean canPerform(String command) {
        return commands.contains(command);
    }
    @Override
    public int compareTo(Animal animal) {
        return Integer.compare(this.getAge(), animal.getAge());
    }
}