package lab1.problem2;

import java.time.LocalDateTime;
import static lab1.problem2.AccountType.*;

public class BankAccount {
    private AccountType accountType;
    private static double rate;
    private final int uniqueNumber;
    private String ownerName;
    private static double balance;
    private final LocalDateTime creationDatetime;

    public BankAccount(String ownerName) {
        this.accountType = SAVINGS;
        this.ownerName = ownerName;
        this.balance = 0;
        this.creationDatetime = LocalDateTime.now();
    }
    public BankAccount(String ownerName, AccountType accountType) {
        this.accountType = accountType;
        this.ownerName = ownerName;
        this.balance = 0;
        this.creationDatetime = LocalDateTime.now();
    }
    public BankAccount(String ownerName, double balance) {
        this.accountType = SAVINGS;
        this.ownerName = ownerName;
        this.balance = 0;
        this.creationDatetime = LocalDateTime.now();
    }
    public BankAccount(String ownerName, AccountType accountType, double balance) {
        this.accountType = accountType;
        this.ownerName = ownerName;
        this.balance = balance;
        this.creationDatetime = LocalDateTime.now();
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

    public void changeAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


}
