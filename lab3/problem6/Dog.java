package lab3.problem6;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Dog " + getName() + ", aged " + getAge() + ", sound: " + getSound();
    }
    @Override
    public String getSound() {
        return "Roof!";
    }
}