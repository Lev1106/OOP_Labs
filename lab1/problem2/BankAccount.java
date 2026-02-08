package lab1.problem2;

import java.time.LocalDateTime;
import static lab1.problem2.AccountType.*;

public class BankAccount {
    private AccountType accountType;
    private static double rate;
    private static int id = 1;
    private final int uniqueNumber;
    private String ownerName;
    private double balance;
    private final LocalDateTime creationDatetime;
    {
        this.uniqueNumber = id++;
        this.creationDatetime = LocalDateTime.now();
    }

    public BankAccount(String ownerName) {
        this(ownerName, SAVINGS, 0);
    }
    public BankAccount(String ownerName, AccountType accountType) {
        this(ownerName, accountType, 0);
    }
    public BankAccount(String ownerName, double balance) {
        this(ownerName, SAVINGS, balance);
    }
    public BankAccount(String ownerName, AccountType accountType, double balance) {
        this.accountType = accountType;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public AccountType getAccountType() {
        return accountType;
    }
    public double getBalance() {
        return balance;
    }
    public static double getRate() {
        return rate;
    }
    public static void setRate(double rate) {
        BankAccount.rate = rate;
    }
    public void applyRate() {
        if (accountType != SAVINGS) return;
        balance += rate * balance;
    }
    public void changeAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


}
