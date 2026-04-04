package lab3.problem6;

public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer", true);
        Animal rex = new Dog("Rex", 5);
        john.assignPet(rex);
        rex.learnCommand("Sit");
        System.out.println(rex.canPerform("Sit"));
        System.out.println(john.calculateTax());
        john.addTask("Walk with dog");
        john.addTask("Buy food");
        for (String task : john) {
            System.out.println("* " + task);
        }
    }
}