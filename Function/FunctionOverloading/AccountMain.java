import java.util.Scanner;

class SavingsAccount {

    private String accountHolder;
	private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient balance!");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class AccountMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        sa.setAccountHolder(name);
        sa.setBalance(balance);


        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        sa.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        sa.withdraw(withdrawAmount);

        System.out.println("\nAccount Holder: " + sa.getAccountHolder());
        sa.displayBalance();

        sc.close();
    }
}