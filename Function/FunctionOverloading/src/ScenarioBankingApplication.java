/*
2.	Banking Application
In an online banking system, customers can transfer money using an account number, mobile number, or UPI ID. How would you design a transferMoney() method using function overloading to handle these different ways of transferring money?
Scenario: A banking application allows money transfers through different methods.
Case 1: The customer transfers money using the  beneficiary account number.
Case 2: The customer transfers money using a registered mobile number.
Case 3: The customer transfers money using a **UPI ID**.

 */
public class ScenarioBankingApplication {

    public void transferMoney(String accountNo,double amount){
        System.out.println("\nTransferring Money Using Account Number");
        System.out.println("Account Number to tranfer money: "+accountNo);
        System.out.println("Amount to tranfer : "+amount);
        System.out.println("Transaction suceessful");

    }

    public void transferMoney(long MobNo,double amount){
        System.out.println("\nTransferring Money Using Mobile Number");
        System.out.println("Mobile no to tranfer money: "+MobNo);
        System.out.println("Amount to tranfer :"+amount);
        System.out.println("Transaction successful");

    }

    public void transferMoney(String UPIid,double amount,String remark){
        System.out.println("\nTransferring Money Using UPIID");
        System.out.println("Enter UPI_ID: "+UPIid);
        System.out.println("Amount to tranfer : "+amount);
        System.out.println("Remark: "+remark);

    }
    public static void main(String[] args) {
        ScenarioBankingApplication application=new ScenarioBankingApplication();
        application.transferMoney("IP23455",1500.00);
        application.transferMoney("1234567890",12000.00);
        application.transferMoney("UPI123456",13450.9,"suceessful");

    }
}
