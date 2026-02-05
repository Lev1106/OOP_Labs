package practice1;

public class Problem5 {
    public static void main(String[] args) {
        double balance = 1234;
        double interest = 10;
        System.out.printf("Balance was %f, interest is %f\n", balance, interest);
        balance = balance * (interest / 100 + 1);
        System.out.printf("New balance is %f", balance);
    }
}
