package practice3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Problem 1
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Barsik", "Cat", 6, "white"));
        Dog dog = new Dog("Alpha", 10, "black", "shepherd dog");
        animals.add(dog);
        for (Animal a : animals) {
            System.out.println(a.info());
        }
        dog.bark();
        dog.bark(21);

        // Problem 2
        HashSet<Person> users = new HashSet<>();
        while (true) {
            System.out.println("Enter 1 if you want to print info about all persons,");
            System.out.println("2 if you want to add new person,");
            System.out.println("Q if you want to quit");
            String str = input.next();
            if (str.equals("Q")) {
                System.out.println("Goodbye!");
                return;
            }
            else if (str.equals("1")) {
                for (Person person : users) {
                    System.out.println(person.toString());
                }
            }
            else if (str.equals("2")) {
                try {
                    System.out.println("Enter 1 if you want to add student,");
                    System.out.println("2 if you want to add staff,");
                    System.out.println("3 if you want to add person.");
                    str = input.next();
                    System.out.print("Enter name: ");
                    String name = input.next();
                    System.out.print("Enter address: ");
                    String address = input.next();
                    if (str.equals("1")) {
                        System.out.print("Enter program: ");
                        String program = input.next();
                        System.out.print("Enter year: ");
                        int year = input.nextInt();
                        System.out.print("Enter fee: ");
                        double fee = input.nextDouble();
                        users.add(new Student(name, address, program, year, fee));
                    } else if (str.equals("2")) {
                        System.out.print("Enter school: ");
                        String school = input.next();
                        System.out.print("Enter pay: ");
                        double pay = input.nextDouble();
                        users.add(new Staff(name, address, school, pay));
                    } else {
                        users.add(new Person(name, address));
                    }
                }
                catch (Exception e) {
                    System.out.printf("You entered incorrect value! Error: %s\n", e);
                    input.nextLine();
                }
            }
            else {
                System.out.println("Incorrect command, try again!");
            }
        }
    }
}
