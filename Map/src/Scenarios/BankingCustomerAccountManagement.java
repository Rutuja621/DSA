package Scenarios;

import java.util.*;

public class BankingCustomerAccountManagement {

    // ================= CUSTOMER POJO =================

    static class Customer {

        private int accountNo;
        private String customerName;
        private String accountType;
        private double balance;
        private String city;
        private int age;
        private String status;

        // Constructor
        public Customer(int accountNo, String customerName,
                        String accountType, double balance,
                        String city, int age, String status) {

            this.accountNo = accountNo;
            this.customerName = customerName;
            this.accountType = accountType;
            this.balance = balance;
            this.city = city;
            this.age = age;
            this.status = status;
        }

        // Getters

        public int getAccountNo() {
            return accountNo;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getAccountType() {
            return accountType;
        }

        public double getBalance() {
            return balance;
        }

        public String getCity() {
            return city;
        }

        public int getAge() {
            return age;
        }

        public String getStatus() {
            return status;
        }

        // Setters

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {

            return "Account No: " + accountNo
                    + ", Name: " + customerName
                    + ", Account Type: " + accountType
                    + ", Balance: " + balance
                    + ", City: " + city
                    + ", Age: " + age
                    + ", Status: " + status;
        }
    }


    // ================= MAP =================

    static Map<Integer, Customer> customers =
            new HashMap<>();


    // ================= 1. CREATE ACCOUNT =================

    public static void createAccount(Customer customer) {

        if (customers.containsKey(customer.getAccountNo())) {

            System.out.println("Account already exists.");

        } else {

            customers.put(
                    customer.getAccountNo(),
                    customer
            );

            System.out.println(
                    "Account created successfully."
            );
        }
    }


    // ================= 2. DISPLAY ALL ACCOUNTS =================

    public static void displayAllAccounts() {

        if (customers.isEmpty()) {

            System.out.println("No accounts available.");
            return;
        }

        for (Customer customer : customers.values()) {

            System.out.println(customer);
        }
    }


    // ================= 3. SEARCH ACCOUNT =================

    public static void searchAccount(int accountNo) {

        Customer customer =
                customers.get(accountNo);

        if (customer != null) {

            System.out.println(customer);

        } else {

            System.out.println("Account Not Found.");
        }
    }


    // ================= 4. UPDATE CUSTOMER =================

    public static void updateCustomer(
            int accountNo,
            Scanner sc) {

        Customer customer =
                customers.get(accountNo);

        if (customer == null) {

            System.out.println("Account Not Found.");
            return;
        }

        System.out.print("Enter new customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter new account type: ");
        String accountType = sc.nextLine();

        System.out.print("Enter new city: ");
        String city = sc.nextLine();

        System.out.print("Enter new age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new status: ");
        String status = sc.nextLine();

        customer.setCustomerName(name);
        customer.setAccountType(accountType);
        customer.setCity(city);
        customer.setAge(age);
        customer.setStatus(status);

        System.out.println(
                "Customer information updated successfully."
        );
    }


    // ================= 5. DELETE ACCOUNT =================

    public static void deleteAccount(int accountNo) {

        if (customers.remove(accountNo) != null) {

            System.out.println(
                    "Account deleted successfully."
            );

        } else {

            System.out.println("Account Not Found.");
        }
    }


    // ================= CHECK ACCOUNT =================

    public static boolean checkActiveAccount(
            Customer customer) {

        if (customer == null) {

            System.out.println("Account Not Found.");

            return false;
        }

        if (!customer.getStatus()
                .equalsIgnoreCase("ACTIVE")) {

            System.out.println(
                    "Transaction Not Allowed."
            );

            System.out.println(
                    "Account is INACTIVE."
            );

            return false;
        }

        return true;
    }


    // ================= 6. DEPOSIT =================

    public static void deposit(
            int accountNo,
            double amount) {

        Customer customer =
                customers.get(accountNo);

        // Check account
        if (!checkActiveAccount(customer)) {
            return;
        }

        // Check amount
        if (amount <= 0) {

            System.out.println(
                    "Invalid deposit amount."
            );

            return;
        }

        double newBalance =
                customer.getBalance() + amount;

        customer.setBalance(newBalance);

        System.out.println("After Deposit:");

        System.out.println(
                accountNo
                        + " - "
                        + customer.getCustomerName()
                        + " - Balance = "
                        + customer.getBalance()
        );
    }


    // ================= 7. WITHDRAW =================

    public static void withdraw(
            int accountNo,
            double amount) {

        Customer customer =
                customers.get(accountNo);

        // Check account
        if (!checkActiveAccount(customer)) {
            return;
        }

        // Check amount
        if (amount <= 0) {

            System.out.println(
                    "Invalid withdrawal amount."
            );

            return;
        }

        // Insufficient balance
        if (amount > customer.getBalance()) {

            System.out.println(
                    "Insufficient Balance."
            );

            return;
        }

        double newBalance =
                customer.getBalance() - amount;

        customer.setBalance(newBalance);

        System.out.println(
                "After Withdrawal:"
        );

        System.out.println(
                accountNo
                        + " - "
                        + customer.getCustomerName()
                        + " - Balance = "
                        + customer.getBalance()
        );
    }


    // ================= 8. TRANSFER MONEY =================

    public static void transfer(
            int fromAccount,
            int toAccount,
            double amount) {

        // Same account validation

        if (fromAccount == toAccount) {

            System.out.println(
                    "Invalid Transaction."
            );

            System.out.println(
                    "From Account and To Account cannot be same."
            );

            return;
        }


        // Find accounts

        Customer sender =
                customers.get(fromAccount);

        Customer receiver =
                customers.get(toAccount);


        // Check sender

        if (!checkActiveAccount(sender)) {
            return;
        }


        // Check receiver

        if (!checkActiveAccount(receiver)) {
            return;
        }


        // Check amount

        if (amount <= 0) {

            System.out.println(
                    "Invalid transfer amount."
            );

            return;
        }


        // Check sender balance

        if (amount > sender.getBalance()) {

            System.out.println(
                    "Insufficient Balance."
            );

            return;
        }


        // Deduct from sender

        sender.setBalance(
                sender.getBalance() - amount
        );


        // Add to receiver

        receiver.setBalance(
                receiver.getBalance() + amount
        );


        System.out.println(
                "After Transfer:"
        );

        System.out.println(
                fromAccount
                        + " - "
                        + sender.getCustomerName()
                        + " - Balance = "
                        + sender.getBalance()
        );

        System.out.println(
                toAccount
                        + " - "
                        + receiver.getCustomerName()
                        + " - Balance = "
                        + receiver.getBalance()
        );
    }


    // ================= 9. HIGHEST BALANCE =================

    public static void highestBalanceAccount() {

        Customer highest = null;

        for (Customer customer :
                customers.values()) {

            if (highest == null ||
                    customer.getBalance()
                            > highest.getBalance()) {

                highest = customer;
            }
        }

        if (highest != null) {

            System.out.println(
                    highest.getAccountNo()
                            + " - "
                            + highest.getCustomerName()
                            + " - "
                            + highest.getBalance()
            );
        }
    }


    // ================= 10. BALANCE > 1 LAKH =================

    public static void customersAboveOneLakh() {

        boolean found = false;

        for (Customer customer :
                customers.values()) {

            if (customer.getBalance() > 100000) {

                System.out.println(
                        customer.getAccountNo()
                                + " - "
                                + customer.getCustomerName()
                );

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No customer has balance greater than ₹1,00,000."
            );
        }
    }


    // ================= 11. TOTAL BANK BALANCE =================

    public static void totalBankBalance() {

        double total = 0;

        for (Customer customer :
                customers.values()) {

            total = total + customer.getBalance();
        }

        System.out.println(
                "Total Bank Balance = ₹" + total
        );
    }


    // ================= 12. CITY-WISE BALANCE =================

    public static void cityWiseBalance() {

        Map<String, Double> cityMap =
                new HashMap<>();


        for (Customer customer :
                customers.values()) {

            String city =
                    customer.getCity();

            double balance =
                    customer.getBalance();


            if (cityMap.containsKey(city)) {

                double oldBalance =
                        cityMap.get(city);

                cityMap.put(
                        city,
                        oldBalance + balance
                );

            } else {

                cityMap.put(
                        city,
                        balance
                );
            }
        }


        for (Map.Entry<String, Double> entry :
                cityMap.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = ₹"
                            + entry.getValue()
            );
        }
    }


    // ================= MAIN =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ================= SAMPLE DATA =================

        customers.put(
                101,
                new Customer(
                        101,
                        "Rahul",
                        "SAVINGS",
                        150000,
                        "Pune",
                        30,
                        "ACTIVE"
                )
        );


        customers.put(
                102,
                new Customer(
                        102,
                        "Amit",
                        "CURRENT",
                        80000,
                        "Mumbai",
                        35,
                        "ACTIVE"
                )
        );


        customers.put(
                103,
                new Customer(
                        103,
                        "Sneha",
                        "SAVINGS",
                        250000,
                        "Pune",
                        28,
                        "ACTIVE"
                )
        );


        customers.put(
                104,
                new Customer(
                        104,
                        "Priya",
                        "SAVINGS",
                        50000,
                        "Nashik",
                        32,
                        "INACTIVE"
                )
        );


        // ================= MENU =================

        int choice;

        do {

            System.out.println(
                    "\n======================================"
            );

            System.out.println(
                    "   BANKING CUSTOMER MANAGEMENT"
            );

            System.out.println(
                    "======================================"
            );

            System.out.println("1.  Create Account");
            System.out.println("2.  Display All Accounts");
            System.out.println("3.  Search Account");
            System.out.println("4.  Update Customer Information");
            System.out.println("5.  Delete Account");
            System.out.println("6.  Deposit Money");
            System.out.println("7.  Withdraw Money");
            System.out.println("8.  Transfer Money");
            System.out.println("9.  Highest Balance Account");
            System.out.println("10. Customers Balance > ₹1,00,000");
            System.out.println("11. Total Bank Balance");
            System.out.println("12. City-wise Total Balance");
            System.out.println("0.  Exit");

            System.out.print(
                    "Enter your choice: "
            );

            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {


                // ================= CREATE =================

                case 1:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int accountNo =
                            sc.nextInt();

                    sc.nextLine();


                    System.out.print(
                            "Enter Customer Name: "
                    );

                    String name =
                            sc.nextLine();


                    System.out.print(
                            "Enter Account Type: "
                    );

                    String accountType =
                            sc.nextLine();


                    System.out.print(
                            "Enter Balance: "
                    );

                    double balance =
                            sc.nextDouble();

                    sc.nextLine();


                    System.out.print(
                            "Enter City: "
                    );

                    String city =
                            sc.nextLine();


                    System.out.print(
                            "Enter Age: "
                    );

                    int age =
                            sc.nextInt();

                    sc.nextLine();


                    System.out.print(
                            "Enter Status: "
                    );

                    String status =
                            sc.nextLine();


                    Customer customer =
                            new Customer(
                                    accountNo,
                                    name,
                                    accountType,
                                    balance,
                                    city,
                                    age,
                                    status
                            );


                    createAccount(customer);

                    break;


                // ================= DISPLAY =================

                case 2:

                    System.out.println(
                            "\nAll Accounts:"
                    );

                    displayAllAccounts();

                    break;


                // ================= SEARCH =================

                case 3:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int searchAccount =
                            sc.nextInt();

                    searchAccount(searchAccount);

                    break;


                // ================= UPDATE =================

                case 4:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int updateAccount =
                            sc.nextInt();

                    sc.nextLine();

                    updateCustomer(
                            updateAccount,
                            sc
                    );

                    break;


                // ================= DELETE =================

                case 5:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int deleteAccount =
                            sc.nextInt();

                    deleteAccount(deleteAccount);

                    break;


                // ================= DEPOSIT =================

                case 6:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int depositAccount =
                            sc.nextInt();


                    System.out.print(
                            "Enter Deposit Amount: "
                    );

                    double depositAmount =
                            sc.nextDouble();


                    deposit(
                            depositAccount,
                            depositAmount
                    );

                    break;


                // ================= WITHDRAW =================

                case 7:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int withdrawAccount =
                            sc.nextInt();


                    System.out.print(
                            "Enter Withdrawal Amount: "
                    );

                    double withdrawAmount =
                            sc.nextDouble();


                    withdraw(
                            withdrawAccount,
                            withdrawAmount
                    );

                    break;


                // ================= TRANSFER =================

                case 8:

                    System.out.print(
                            "Enter From Account: "
                    );

                    int fromAccount =
                            sc.nextInt();


                    System.out.print(
                            "Enter To Account: "
                    );

                    int toAccount =
                            sc.nextInt();


                    System.out.print(
                            "Enter Transfer Amount: "
                    );

                    double transferAmount =
                            sc.nextDouble();


                    transfer(
                            fromAccount,
                            toAccount,
                            transferAmount
                    );

                    break;


                // ================= HIGHEST =================

                case 9:

                    System.out.println(
                            "\nHighest Balance:"
                    );

                    highestBalanceAccount();

                    break;


                // ================= > 1 LAKH =================

                case 10:

                    System.out.println(
                            "\nCustomers with Balance > 100000:"
                    );

                    customersAboveOneLakh();

                    break;


                // ================= TOTAL =================

                case 11:

                    totalBankBalance();

                    break;


                // ================= CITY =================

                case 12:

                    System.out.println(
                            "\nCity-wise Total Balance:"
                    );

                    cityWiseBalance();

                    break;


                // ================= EXIT =================

                case 0:

                    System.out.println(
                            "Thank you for using Banking System."
                    );

                    break;


                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 0);


        sc.close();
    }
}