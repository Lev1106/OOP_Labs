package lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;
    public Bank() {
        this.accounts = new Vector<>();
    }
    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingsAccount) ((SavingsAccount) a).addInterest();
            else if (a instanceof CheckingAccount) ((CheckingAccount) a).deductFee();
        }
    }
    public void openAccount(Account a) {
        accounts.add(a);
    }
    public void closeAccount(Account a) {
        accounts.remove(a);
    }

    public void listOfAccounts() {
        for (Account a : accounts) a.print();
    }
}