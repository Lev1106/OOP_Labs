package lab2.problem5;

public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka); // John owns Rex
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        // John goes on vacation and leaves Rex with Alice
        john.leavePetWith(alice);
        // Registry reflects that Alice is taking care of Rex
        System.out.println(registry);
        // John returns from vacation and retrieves Rex
        john.retrievePetFrom(alice);
        // Registry reflects that John has his dog back
        System.out.println(registry);

        Animal birdie = new Bird("Chirik", 2);
        Animal rex = new Dog("Rex", 4);

        alice.assignPet(birdie);
        john.assignPet(rex);
        System.out.println(registry);

        try {
            alice.assignPet(rex);
            john.leavePetWith(alice);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(registry);
    }
}