package Scenarios;

import java.util.*;

public class OrderManagementSystem {

    // ================= ORDER POJO =================

    static class Order {

        private int orderId;
        private String customerName;
        private String productName;
        private String category;
        private int quantity;
        private double price;
        private double discount;
        private String status;
        private String city;

        // Constructor
        public Order(int orderId,
                     String customerName,
                     String productName,
                     String category,
                     int quantity,
                     double price,
                     double discount,
                     String status,
                     String city) {

            this.orderId = orderId;
            this.customerName = customerName;
            this.productName = productName;
            this.category = category;
            this.quantity = quantity;
            this.price = price;
            this.discount = discount;
            this.status = status;
            this.city = city;
        }

        // ================= GETTERS =================

        public int getOrderId() {
            return orderId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getProductName() {
            return productName;
        }

        public String getCategory() {
            return category;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

        public double getDiscount() {
            return discount;
        }

        public String getStatus() {
            return status;
        }

        public String getCity() {
            return city;
        }

        // ================= SETTERS =================

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {

            return "Order ID: " + orderId
                    + ", Customer: " + customerName
                    + ", Product: " + productName
                    + ", Category: " + category
                    + ", Quantity: " + quantity
                    + ", Price: " + price
                    + ", Discount: " + discount + "%"
                    + ", Status: " + status
                    + ", City: " + city;
        }
    }


    // ================= MAP =================

    static Map<Integer, Order> orders = new HashMap<>();


    // ================= 1. ADD ORDER =================

    public static void addOrder(Order order) {

        if (orders.containsKey(order.getOrderId())) {

            System.out.println("Order already exists.");

        } else {

            orders.put(
                    order.getOrderId(),
                    order
            );

            System.out.println(
                    "Order added successfully."
            );
        }
    }


    // ================= 2. UPDATE ORDER =================

    public static void updateOrder(
            int orderId,
            Scanner sc) {

        Order order = orders.get(orderId);

        if (order == null) {

            System.out.println("Order not found.");
            return;
        }

        System.out.print("Enter new customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter new product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter new category: ");
        String category = sc.nextLine();

        System.out.print("Enter new quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter new price: ");
        double price = sc.nextDouble();

        System.out.print("Enter new discount: ");
        double discount = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter new status: ");
        String status = sc.nextLine();

        System.out.print("Enter new city: ");
        String city = sc.nextLine();

        order.setCustomerName(customerName);
        order.setProductName(productName);
        order.setCategory(category);
        order.setQuantity(quantity);
        order.setPrice(price);
        order.setDiscount(discount);
        order.setStatus(status);
        order.setCity(city);

        System.out.println(
                "Order updated successfully."
        );
    }


    // ================= 3. DELETE ORDER =================

    public static void deleteOrder(int orderId) {

        if (orders.remove(orderId) != null) {

            System.out.println(
                    "Order deleted successfully."
            );

        } else {

            System.out.println(
                    "Order not found."
            );
        }
    }


    // ================= 4. SEARCH ORDER =================

    public static void searchOrder(int orderId) {

        Order order = orders.get(orderId);

        if (order != null) {

            System.out.println(order);

        } else {

            System.out.println(
                    "Order not found."
            );
        }
    }


    // ================= 5. CALCULATE GROSS AMOUNT =================

    public static double calculateGrossAmount(
            Order order) {

        return order.getQuantity()
                * order.getPrice();
    }


    // ================= 6. CALCULATE DISCOUNT =================

    public static double calculateDiscount(
            Order order) {

        double grossAmount =
                calculateGrossAmount(order);

        return grossAmount
                * order.getDiscount()
                / 100;
    }


    // ================= AFTER DISCOUNT =================

    public static double calculateAfterDiscount(
            Order order) {

        double grossAmount =
                calculateGrossAmount(order);

        double discountAmount =
                calculateDiscount(order);

        return grossAmount - discountAmount;
    }


    // ================= 7. CALCULATE GST =================

    public static double calculateGST(
            Order order) {

        double afterDiscount =
                calculateAfterDiscount(order);

        return afterDiscount * 18 / 100;
    }


    // ================= 8. FINAL BILL =================

    public static double calculateFinalBill(
            Order order) {

        double afterDiscount =
                calculateAfterDiscount(order);

        double gst =
                calculateGST(order);

        return afterDiscount + gst;
    }


    // ================= DISPLAY BILL =================

    public static void displayBill(int orderId) {

        Order order = orders.get(orderId);

        if (order == null) {

            System.out.println(
                    "Order not found."
            );

            return;
        }

        double grossAmount =
                calculateGrossAmount(order);

        double discountAmount =
                calculateDiscount(order);

        double afterDiscount =
                calculateAfterDiscount(order);

        double gst =
                calculateGST(order);

        double finalAmount =
                calculateFinalBill(order);


        System.out.println(
                "\nOrder " + orderId + ":"
        );

        System.out.println(
                "Gross Amount = " + grossAmount
        );

        System.out.println(
                "Discount = " + discountAmount
        );

        System.out.println(
                "After Discount = " + afterDiscount
        );

        System.out.println(
                "GST = " + gst
        );

        System.out.println(
                "Final Amount = " + finalAmount
        );
    }


    // ================= 9. HIGHEST VALUE ORDER =================

    public static void highestValueOrder() {

        Order highestOrder = null;

        double highestAmount = 0;

        for (Order order : orders.values()) {

            double finalAmount =
                    calculateFinalBill(order);

            if (highestOrder == null ||
                    finalAmount > highestAmount) {

                highestOrder = order;
                highestAmount = finalAmount;
            }
        }

        if (highestOrder != null) {

            System.out.println(
                    "Order ID = "
                            + highestOrder.getOrderId()
            );

            System.out.println(
                    "Customer = "
                            + highestOrder.getCustomerName()
            );

            System.out.println(
                    "Final Amount = "
                            + highestAmount
            );
        }
    }


    // ================= 10. CUSTOMER-WISE PURCHASE =================

    public static void customerWisePurchase() {

        Map<String, Double> customerMap =
                new HashMap<>();


        for (Order order : orders.values()) {

            String customer =
                    order.getCustomerName();

            double finalAmount =
                    calculateFinalBill(order);


            if (customerMap.containsKey(customer)) {

                double oldAmount =
                        customerMap.get(customer);

                customerMap.put(
                        customer,
                        oldAmount + finalAmount
                );

            } else {

                customerMap.put(
                        customer,
                        finalAmount
                );
            }
        }


        for (Map.Entry<String, Double> entry :
                customerMap.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }


    // ================= 11. CATEGORY-WISE REVENUE =================

    public static void categoryWiseRevenue() {

        Map<String, Double> categoryMap =
                new HashMap<>();


        for (Order order : orders.values()) {

            String category =
                    order.getCategory();

            double finalAmount =
                    calculateFinalBill(order);


            if (categoryMap.containsKey(category)) {

                double oldAmount =
                        categoryMap.get(category);

                categoryMap.put(
                        category,
                        oldAmount + finalAmount
                );

            } else {

                categoryMap.put(
                        category,
                        finalAmount
                );
            }
        }


        for (Map.Entry<String, Double> entry :
                categoryMap.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }


    // ================= 12. CANCELLED ORDERS =================

    public static void cancelledOrders() {

        boolean found = false;

        for (Order order : orders.values()) {

            if (order.getStatus()
                    .equalsIgnoreCase("CANCELLED")) {

                System.out.println(
                        order.getOrderId()
                                + " - "
                                + order.getCustomerName()
                                + " - "
                                + order.getProductName()
                );

                found = true;
            }
        }


        if (!found) {

            System.out.println(
                    "No cancelled orders."
            );
        }
    }


    // ================= 13. ORDERS ABOVE 50000 =================

    public static void ordersAbove50000() {

        boolean found = false;

        for (Order order : orders.values()) {

            double finalAmount =
                    calculateFinalBill(order);

            if (finalAmount > 50000) {

                System.out.println(
                        order.getOrderId()
                                + " - "
                                + order.getCustomerName()
                );

                found = true;
            }
        }


        if (!found) {

            System.out.println(
                    "No orders above ₹50,000."
            );
        }
    }


    // ================= 14. UPDATE STATUS =================

    public static void updateOrderStatus(
            int orderId,
            String newStatus) {

        Order order =
                orders.get(orderId);

        if (order == null) {

            System.out.println(
                    "Order not found."
            );

            return;
        }

        order.setStatus(newStatus);

        System.out.println(
                "Order status updated successfully."
        );
    }


    // ================= 15. TOP CUSTOMER =================

    public static void topCustomer() {

        Map<String, Double> customerMap =
                new HashMap<>();


        for (Order order : orders.values()) {

            String customer =
                    order.getCustomerName();

            double finalAmount =
                    calculateFinalBill(order);


            customerMap.put(
                    customer,
                    customerMap.getOrDefault(
                            customer,
                            0.0
                    ) + finalAmount
            );
        }


        String topCustomer = null;

        double highestPurchase = 0;


        for (Map.Entry<String, Double> entry :
                customerMap.entrySet()) {

            if (topCustomer == null ||
                    entry.getValue()
                            > highestPurchase) {

                topCustomer = entry.getKey();

                highestPurchase =
                        entry.getValue();
            }
        }


        if (topCustomer != null) {

            System.out.println(
                    "Top Customer = "
                            + topCustomer
            );

            System.out.println(
                    "Total Purchase = "
                            + highestPurchase
            );
        }
    }


    // ================= DISPLAY ALL ORDERS =================

    public static void displayAllOrders() {

        if (orders.isEmpty()) {

            System.out.println(
                    "No orders available."
            );

            return;
        }

        for (Order order : orders.values()) {

            System.out.println(order);
        }
    }


    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ================= SAMPLE DATA =================

        orders.put(
                101,
                new Order(
                        101,
                        "Rahul",
                        "Laptop",
                        "Electronics",
                        2,
                        60000,
                        10,
                        "DELIVERED",
                        "Pune"
                )
        );


        orders.put(
                102,
                new Order(
                        102,
                        "Amit",
                        "Mobile",
                        "Electronics",
                        1,
                        40000,
                        5,
                        "DELIVERED",
                        "Mumbai"
                )
        );


        orders.put(
                103,
                new Order(
                        103,
                        "Rahul",
                        "Keyboard",
                        "Electronics",
                        3,
                        2000,
                        0,
                        "CANCELLED",
                        "Pune"
                )
        );


        orders.put(
                104,
                new Order(
                        104,
                        "Sneha",
                        "Laptop",
                        "Electronics",
                        1,
                        70000,
                        15,
                        "DELIVERED",
                        "Pune"
                )
        );


        // ================= MENU =================

        int choice;

        do {

            System.out.println(
                    "\n======================================"
            );

            System.out.println(
                    "       ORDER MANAGEMENT SYSTEM"
            );

            System.out.println(
                    "======================================"
            );

            System.out.println(
                    "1.  Add Order"
            );

            System.out.println(
                    "2.  Update Order"
            );

            System.out.println(
                    "3.  Delete Order"
            );

            System.out.println(
                    "4.  Search Order By ID"
            );

            System.out.println(
                    "5.  Calculate Order Amount"
            );

            System.out.println(
                    "6.  Apply Discount"
            );

            System.out.println(
                    "7.  Calculate GST"
            );

            System.out.println(
                    "8.  Calculate Final Bill"
            );

            System.out.println(
                    "9.  Find Highest-Value Order"
            );

            System.out.println(
                    "10. Customer-wise Total Purchase"
            );

            System.out.println(
                    "11. Category-wise Revenue"
            );

            System.out.println(
                    "12. Find Cancelled Orders"
            );

            System.out.println(
                    "13. Orders Above ₹50,000"
            );

            System.out.println(
                    "14. Update Order Status"
            );

            System.out.println(
                    "15. Find Top Customer"
            );

            System.out.println(
                    "16. Display All Orders"
            );

            System.out.println(
                    "0. Exit"
            );


            System.out.print(
                    "Enter your choice: "
            );

            choice =
                    sc.nextInt();

            sc.nextLine();


            switch (choice) {


                // ================= ADD =================

                case 1:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int orderId =
                            sc.nextInt();

                    sc.nextLine();


                    System.out.print(
                            "Enter Customer Name: "
                    );

                    String customerName =
                            sc.nextLine();


                    System.out.print(
                            "Enter Product Name: "
                    );

                    String productName =
                            sc.nextLine();


                    System.out.print(
                            "Enter Category: "
                    );

                    String category =
                            sc.nextLine();


                    System.out.print(
                            "Enter Quantity: "
                    );

                    int quantity =
                            sc.nextInt();


                    System.out.print(
                            "Enter Price: "
                    );

                    double price =
                            sc.nextDouble();


                    System.out.print(
                            "Enter Discount (%): "
                    );

                    double discount =
                            sc.nextDouble();

                    sc.nextLine();


                    System.out.print(
                            "Enter Status: "
                    );

                    String status =
                            sc.nextLine();


                    System.out.print(
                            "Enter City: "
                    );

                    String city =
                            sc.nextLine();


                    Order order =
                            new Order(
                                    orderId,
                                    customerName,
                                    productName,
                                    category,
                                    quantity,
                                    price,
                                    discount,
                                    status,
                                    city
                            );


                    addOrder(order);

                    break;


                // ================= UPDATE =================

                case 2:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int updateId =
                            sc.nextInt();

                    sc.nextLine();


                    updateOrder(
                            updateId,
                            sc
                    );

                    break;


                // ================= DELETE =================

                case 3:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int deleteId =
                            sc.nextInt();


                    deleteOrder(deleteId);

                    break;


                // ================= SEARCH =================

                case 4:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int searchId =
                            sc.nextInt();


                    searchOrder(searchId);

                    break;


                // ================= ORDER AMOUNT =================

                case 5:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int amountId =
                            sc.nextInt();


                    Order amountOrder =
                            orders.get(amountId);


                    if (amountOrder != null) {

                        System.out.println(
                                "Gross Amount = "
                                        + calculateGrossAmount(
                                        amountOrder
                                )
                        );

                    } else {

                        System.out.println(
                                "Order not found."
                        );
                    }

                    break;


                // ================= DISCOUNT =================

                case 6:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int discountId =
                            sc.nextInt();


                    Order discountOrder =
                            orders.get(discountId);


                    if (discountOrder != null) {

                        System.out.println(
                                "Discount Amount = "
                                        + calculateDiscount(
                                        discountOrder
                                )
                        );

                    } else {

                        System.out.println(
                                "Order not found."
                        );
                    }

                    break;


                // ================= GST =================

                case 7:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int gstId =
                            sc.nextInt();


                    Order gstOrder =
                            orders.get(gstId);


                    if (gstOrder != null) {

                        System.out.println(
                                "GST = "
                                        + calculateGST(
                                        gstOrder
                                )
                        );

                    } else {

                        System.out.println(
                                "Order not found."
                        );
                    }

                    break;


                // ================= FINAL BILL =================

                case 8:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int billId =
                            sc.nextInt();


                    displayBill(billId);

                    break;


                // ================= HIGHEST =================

                case 9:

                    System.out.println(
                            "\nHighest Value Order:"
                    );

                    highestValueOrder();

                    break;


                // ================= CUSTOMER PURCHASE =================

                case 10:

                    System.out.println(
                            "\nCustomer-wise Purchase:"
                    );

                    customerWisePurchase();

                    break;


                // ================= CATEGORY =================

                case 11:

                    System.out.println(
                            "\nCategory-wise Revenue:"
                    );

                    categoryWiseRevenue();

                    break;


                // ================= CANCELLED =================

                case 12:

                    System.out.println(
                            "\nCancelled Orders:"
                    );

                    cancelledOrders();

                    break;


                // ================= ABOVE 50000 =================

                case 13:

                    System.out.println(
                            "\nOrders Above ₹50,000:"
                    );

                    ordersAbove50000();

                    break;


                // ================= STATUS =================

                case 14:

                    System.out.print(
                            "Enter Order ID: "
                    );

                    int statusId =
                            sc.nextInt();

                    sc.nextLine();


                    System.out.print(
                            "Enter New Status: "
                    );

                    String newStatus =
                            sc.nextLine();


                    updateOrderStatus(
                            statusId,
                            newStatus
                    );

                    break;


                // ================= TOP CUSTOMER =================

                case 15:

                    System.out.println(
                            "\nTop Customer:"
                    );

                    topCustomer();

                    break;


                // ================= DISPLAY =================

                case 16:

                    System.out.println(
                            "\nAll Orders:"
                    );

                    displayAllOrders();

                    break;


                // ================= EXIT =================

                case 0:

                    System.out.println(
                            "Thank you!"
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