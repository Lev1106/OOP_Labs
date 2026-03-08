package lab2.problem3;

public class CheckingAccount extends Account {
    private static final int FREE_TRANSACTIONS = 5;
    private int transactions;
    public CheckingAccount(int a) {
        super(a);
    }
    @Override
    public void withdraw(double sum) {
        transactions++;
        super.withdraw(sum);
    }
    @Override
    public void deposit(double sum) {
        transactions++;
        super.deposit(sum);
    }
    @Override
    public String toString() {
        return super.toString() + " and " + transactions + " out of " + FREE_TRANSACTIONS + " free transactions";
    }
    public void deductFee() {
        if (transactions > FREE_TRANSACTIONS) {
            super.withdraw(0.02 * (transactions - FREE_TRANSACTIONS));
            transactions = 0;;
        }
        else transactions = 0;
    }
}