package practice1;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float score;
        System.out.print("Enter your score: ");
        score = input.nextFloat();
        if (score >= 94.5) System.out.println("A");
        else if (score >= 89.5) System.out.println("A-");
        else if (score >= 84.5) System.out.println("B+");
        else if (score >= 79.5) System.out.println("B");
        else if (score >= 74.5) System.out.println("B-");
        else if (score >= 69.5) System.out.println("C+");
        else if (score >= 64.5) System.out.println("C");
        else if (score >= 59.5) System.out.println("C-");
        else if (score >= 54.5) System.out.println("D+");
        else if (score >= 49.5) System.out.println("D");
        else System.out.println("F");
    }
}
