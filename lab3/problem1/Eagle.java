package lab3.problem1;

public class Eagle extends Bird implements Flyable {
    public Eagle(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Keeeeyaaaarr");
    }
    @Override
    public void fly() {
        System.out.println(getName() + " is flying!");
    }
}
