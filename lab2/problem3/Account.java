package lab2.problem3;

public class Account{
    private double balance; // The current balance
    private int accNumber; // The account number
    public Account(int a){
        balance = 0.0;
        accNumber = a;
    }
    public void deposit(double sum) {
        if (sum <= 0) return;
        balance += sum;
    }
    public void withdraw(double sum) {
        if (balance < sum) return;
        balance -= sum;
    }
    public double getBalance() { return balance; }
    public double getAccountNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other) {
        if (amount <= balance && amount > 0) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }
    @Override
    public String toString() {
        return "Account " + accNumber + " with balance " + balance;
    }
    public final void print() {
        // Don’t override this, override the toString method
        System.out.println(toString());
    }
}