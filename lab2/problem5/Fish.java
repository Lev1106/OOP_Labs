package lab2.problem5;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Fish " + getName() + ", aged " + getAge() + ", sound: " + getSound();
    }
    @Override
    public String getSound() {
        return "Pop!";
    }
}