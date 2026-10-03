//In a Banking System, how would you use constructor overloading to create different types of accounts?

public class BankingSysConstructorScenario{
	    private String accountNumber;
		private String accountHolder;
		private double balance;
		private String accountType;
	BankingSysConstructorScenario(String accountNumber,String accountHolder){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=0.0;
		this.accountType="savings";
			
	}
	
	  public BankingSysConstructorScenario(String accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.accountType = "Savings";     // Default value
    }

    
    public BankingSysConstructorScenario(String accountNumber, String accountHolder, double initialDeposit, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.accountType = accountType;
    }

 
    public void displayAccountInfo() {
        System.out.println(accountHolder + " (" + accountType + ") - Account No: " + accountNumber + " | Balance: $" + balance);
    }
	
	public static void main(String [] arg){
		BankingSysConstructorScenario acc1 = new BankingSysConstructorScenario("AC1001", "Amit");

       
        BankingSysConstructorScenario acc2 = new BankingSysConstructorScenario("AC1002", "Priya", 5000.0);

        
        BankingSysConstructorScenario acc3 = new BankingSysConstructorScenario("AC1003", "John", 10000.0, "Current");


        acc1.displayAccountInfo(); 
        acc2.displayAccountInfo(); 
        acc3.displayAccountInfo(); 
		
		
	}





}