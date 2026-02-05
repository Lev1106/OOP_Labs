package practice1;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, D;
        System.out.print("Enter a: ");
        a = input.nextDouble();
        System.out.print("Enter b: ");
        b = input.nextDouble();
        System.out.print("Enter c: ");
        c = input.nextDouble();
        D = b * b - 4 * a * c;
        if (D < 0) {
        	System.out.println("Error, roots don't exist!");
        }
        else if (a == 0) {
        	System.out.println("Error, equation isn't quadratic!");
        }
        else if (D == 0) {
        	double x = -b / (2 * a);
        	System.out.printf("There is one root x = %f", x);
        }
        else {
        	double x1 = (double)((-b - Math.sqrt(D)) / (2 * a));
        	double x2 = (double)((-b + Math.sqrt(D)) / (2 * a));
        	System.out.printf("There are two roots, x1 = %f, x2 = %f", x1, x2);
        }
    }
}
