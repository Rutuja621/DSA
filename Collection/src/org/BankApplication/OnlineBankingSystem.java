package org.BankApplication;

interface YearlyCharge {
    double calculateYearlyCharge();
}

// Abstract superclass
abstract class Account implements YearlyCharge {
    private final String accountNumber; // cannot be modified
    private String holderName;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract method for yearly charges (must be implemented by subclasses)
    public abstract double calculateYearlyCharge();

    // Final method — cannot be overridden
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateYearlyCharge() {
        // Example: yearly maintenance fee for savings account
        return balance * 0.02; // 2% yearly charge
    }
}

// CurrentAccount subclass
class CurrentAccount extends Account {
    private double transactionFee;

    public CurrentAccount(String accountNumber, String holderName, double balance, double transactionFee) {
        super(accountNumber, holderName, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateYearlyCharge() {
        // Example: yearly maintenance fee for current account
        return transactionFee * 12; // monthly fee * 12 months
    }
}

// Main class demonstrating dynamic polymorphism and loose coupling
public class OnlineBankingSystem {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("SBIN001", "Rutuja", 50000, 0.05);
        Account acc2 = new CurrentAccount("SBIN002", "misal", 5000, 200);

        Account[] accounts = {acc1, acc2};


        for (Account acc : accounts) {
            acc.displayAccountInfo();
            System.out.println("Yearly Charge: " + acc.calculateYearlyCharge());
            System.out.println("-----------------------------");
        }
    }
}
