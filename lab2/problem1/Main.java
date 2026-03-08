package lab2.problem1;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part a: 3D Shapes");
        Shape3D cylinder = new Cylinder(5, 10);
        Shape3D cube = new Cube(4);
        Shape3D sphere = new Sphere(3);
        System.out.println(cylinder.volume());
        System.out.println(cube.volume());
        System.out.println(sphere.volume());

        System.out.println("\nPart b: Library System");
        LibraryItem book = new Book("1984", "George Orwell", 1949, 352, "dystopian novel set in a totalitarian Oceania, where the Party, led by Big Brother, enforces absolute conformity through surveillance, propaganda, and rewriting history");
        System.out.println(book.toString());

        System.out.println("\nPart c: Superclass and Subclass");
        HashSet<Character> world = new HashSet<>();
        Player player1 = new Player("Lev", 10, "lev1106");
        Player player2 = new Player("Lev", 10, "lev1106");
        Player player3 = new Player("Lev", 10, "lev2217");
        Character character = new Character("Trader", 5);
        world.add(player1);
        world.add(player2);
        world.add(player3);
        world.add(character);
        System.out.println(world.size() + " characters:");
        for (Character c : world) {
            System.out.println(c);
        }
    }
}