package lab3.problem6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class Person implements Comparable<Person>, Taxable, Iterable<String> {
    private String name;
    private int age;
    private Animal pet;
    private List<String> todoList = new ArrayList<>();
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public Iterator<String> iterator() {
        return todoList.iterator();
    }
    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }
    public void addTask(String task) {
        todoList.add(task);
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
    public void assignPet(Animal pet) {
        this.pet = pet;
    }
    public void removePet() {
        this.pet = null;
    }
    public void leavePetWith(Person person) {
        if (pet != null) {
            person.assignPet(pet);
            this.removePet();
        }
    }
    public void retrievePetFrom(Person person) {
        if (person.pet != null) {
            this.assignPet(person.pet);
            person.removePet();
        }
    }
    public boolean hasPet() {
        return pet != null;
    }
    public abstract String getOccupation();
    @Override
    public String toString() {
        return name + " is a " + getOccupation() + (hasPet() ? " and has a pet " + pet.toString() : "");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age && name.equals(other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}