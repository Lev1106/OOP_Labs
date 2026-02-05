package lab1.problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = new Data();
        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String str = input.next();
            if (str.equals("Q")) {
                System.out.printf("Average = %.1f\n", data.getAverage());
                System.out.printf("Maximum = %.1f\n", data.getMaximum());
                return;
            }
            else {
                try {
                    double value = Double.parseDouble(str);
                    data.addValue(value);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
