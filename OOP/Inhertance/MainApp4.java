/*
Question 4: Create a base class Account with accountNumber and balance.
Create a child class SavingsAccount that adds interestRate.
Calculate final balance after adding interest.
Asked In Practice Assignment
Description
This program uses inheritance to simulate a banking system.
The child class extends functionality by applying interest calculation.

Input
Enter Account Number: 12345
Enter Balance: 10000
Enter Interest Rate: 5

Output
Account Number: 12345
Initial Balance: 10000
Interest: 500
Final Balance: 10500*/


class Account{

String accountNumber;
double balance;

public Account(String accountNumber,double balance){
	this.accountNumber=accountNumber;
	this.balance=balance;
}





}

class SavingsAccount extends Account{
	float interestRate;
    double interest;
    double finalBalance;
	
	public SavingsAccount(String accountNumber,double balance,float interestRate){
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	
	 public void calculation() {
        interest = (balance * interestRate) / 100;
        finalBalance = balance + interest;
    }

    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Initial Balance : " + balance);
        System.out.println("Interest : " + interest);
        System.out.println("Final Balance : " + finalBalance);
    }


}

public class MainApp4{
	public static void main(String [] arg){
		SavingsAccount s = new SavingsAccount("ABC1223", 23445.0, 5);

        s.calculation();
        s.display();
		
		
	}


}