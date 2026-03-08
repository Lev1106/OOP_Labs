package lab2.problem3;

public class Main {
    public static void main(String[] args) {
        Bank kaspi = new Bank();
        SavingsAccount acc1 = new SavingsAccount(1234, 5);
        CheckingAccount acc2 = new CheckingAccount(4321);
        Account acc3 = new Account(6767);
        acc1.deposit(1000);
        acc2.deposit(2000);
        acc2.withdraw(100);
        acc2.deposit(10000);
        acc2.withdraw(11000);
        acc2.deposit(100);
        acc2.deposit(321);
        acc3.deposit(5000);

        kaspi.openAccount(acc1);
        kaspi.openAccount(acc2);
        kaspi.openAccount(acc3);
        kaspi.listOfAccounts();
        kaspi.update();
        System.out.println("After updating");
        kaspi.listOfAccounts();
        kaspi.closeAccount(acc2);
        kaspi.closeAccount(acc3);
        System.out.println("After closing");
        kaspi.listOfAccounts();
    }
}