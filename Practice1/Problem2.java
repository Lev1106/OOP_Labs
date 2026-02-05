package practice1;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a;
        System.out.print("Enter side of square: ");
        a = input.nextFloat();
        float area = a * a;
        float perimeter = 4 * a;
        float diagonal = (float)(a * Math.sqrt(2));
        System.out.printf("Area is %f, perimeter is %f, length of diagonal is %f", area, perimeter, diagonal);
    }
}
