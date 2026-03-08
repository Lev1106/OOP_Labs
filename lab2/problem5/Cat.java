package lab2.problem5;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Cat " + getName() + ", aged " + getAge() + ", sound: " + getSound();
    }
    @Override
    public String getSound() {
        return "Meow!";
    }
}