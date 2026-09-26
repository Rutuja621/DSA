public class BankingApplication {
    public void transferMoney(long accNumber,double amount){
        System.out.println("Transferring amount using Account Number");
        System.out.println("Account Number:"+accNumber+"\n"+"Amount: "+amount);
    }

    public void transferMoney(String bankName,double amount,long phnNo){
        System.out.println("Transferring amount using phone Number");

        System.out.println("Bank Name:"+bankName+"\n"+"Amount: "+amount+"\n"+"Phone No: "+phnNo);

    }

    public void transferMoney(double amount,String UPIid){
        System.out.println("Transferring amount using UPI ID");
        System.out.println("UPI ID:"+UPIid+"\n"+"Amount: "+amount);


    }


    public static void main(String[] args) {
       BankingApplication bk=new BankingApplication();
       bk.transferMoney("Sbi",2345,1234567890);
        System.out.println();
        bk.transferMoney(1234,"SBIN123");

    }
}
