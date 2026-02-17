package practice3;

public class Dog extends Animal {
    private final String breed;

    public Dog() {
        super("Unnamed", "Dog", 0, "Unknown");
        this.breed = "Mixed";
    }

    public Dog(String name, int age, String color, String breed) {
        super(name, "Dog", age, color);
        this.breed = breed;
    }
    @Override
    public String info() {
        return super.info() + ", breed is " + this.breed;
    }
    public String info(String ownerName) {
        return super.info() + ", owner's name is " + ownerName;
    }
    public void bark() {
        System.out.println("Woof!");
    }
    public void bark(int count) {
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) System.out.print("Woof! ");
            else System.out.print("Ruff! ");
        }
        System.out.println();
    }
}
