package practice4.problem2;

public class Cat implements CanHavePizza {
    public String name;
    public String breed;
    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza!");
    }
}
