package Scenarios;

import java.util.*;

public class ProductInventoryManagement {

    // ================= PRODUCT POJO =================

    static class Product {

        private int productId;
        private String productName;
        private String category;
        private double price;
        private int quantity;
        private String supplier;
        private String status;

        public Product(int productId, String productName, String category,
                       double price, int quantity, String supplier,
                       String status) {

            this.productId = productId;
            this.productName = productName;
            this.category = category;
            this.price = price;
            this.quantity = quantity;
            this.supplier = supplier;
            this.status = status;
        }

        public int getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getSupplier() {
            return supplier;
        }

        public String getStatus() {
            return status;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {

            return "ID: " + productId
                    + ", Name: " + productName
                    + ", Category: " + category
                    + ", Price: " + price
                    + ", Quantity: " + quantity
                    + ", Supplier: " + supplier
                    + ", Status: " + status;
        }
    }


    // ================= MAP =================

    static Map<Integer, Product> products = new HashMap<>();


    // ================= 1. ADD PRODUCT =================

    public static void addProduct(Product product) {

        if (products.containsKey(product.getProductId())) {

            System.out.println("Product already exists.");

        } else {

            products.put(product.getProductId(), product);

            System.out.println("Product added successfully.");
        }
    }


    // ================= 2. UPDATE PRODUCT =================

    public static void updateProduct(int id, Scanner sc) {

        Product product = products.get(id);

        if (product == null) {

            System.out.println("Product not found.");
            return;
        }

        System.out.print("Enter new product name: ");
        product.setProductName(sc.nextLine());

        System.out.print("Enter new category: ");
        product.setCategory(sc.nextLine());

        System.out.print("Enter new price: ");
        product.setPrice(sc.nextDouble());

        System.out.print("Enter new quantity: ");
        product.setQuantity(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter new supplier: ");
        product.setSupplier(sc.nextLine());

        System.out.print("Enter new status: ");
        product.setStatus(sc.nextLine());

        System.out.println("Product updated successfully.");
    }


    // ================= 3. DELETE PRODUCT =================

    public static void deleteProduct(int id) {

        if (products.remove(id) != null) {

            System.out.println("Product deleted successfully.");

        } else {

            System.out.println("Product not found.");
        }
    }


    // ================= 4. SEARCH BY ID =================

    public static void searchById(int id) {

        Product product = products.get(id);

        if (product != null) {

            System.out.println(product);

        } else {

            System.out.println("Product not found.");
        }
    }


    // ================= 5. SEARCH BY CATEGORY =================

    public static void searchByCategory(String category) {

        boolean found = false;

        for (Product product : products.values()) {

            if (product.getCategory().equalsIgnoreCase(category)) {

                System.out.println(product);

                found = true;
            }
        }

        if (!found) {

            System.out.println("No product found in this category.");
        }
    }


    // ================= 6. TOTAL INVENTORY VALUE =================

    public static void totalInventoryValue() {

        double total = 0;

        for (Product product : products.values()) {

            double value =
                    product.getPrice() * product.getQuantity();

            total = total + value;
        }

        System.out.println("Total Inventory Value = " + total);
    }


    // ================= 7. MOST EXPENSIVE PRODUCT =================

    public static void mostExpensiveProduct() {

        Product expensive = null;

        for (Product product : products.values()) {

            if (expensive == null ||
                    product.getPrice() > expensive.getPrice()) {

                expensive = product;
            }
        }

        if (expensive != null) {

            System.out.println(
                    expensive.getProductName()
                            + " - "
                            + expensive.getPrice()
            );
        }
    }


    // ================= 8. LOW STOCK PRODUCTS =================

    public static void lowStockProducts() {

        boolean found = false;

        for (Product product : products.values()) {

            if (product.getQuantity() > 0 &&
                    product.getQuantity() <= 5) {

                System.out.println(
                        product.getProductName()
                                + " - Quantity: "
                                + product.getQuantity()
                );

                found = true;
            }
        }

        if (!found) {

            System.out.println("No low-stock products.");
        }
    }


    // ================= 9. INCREASE STOCK =================

    public static void increaseStock(int id, int purchaseQuantity) {

        Product product = products.get(id);

        if (product == null) {

            System.out.println("Product not found.");
            return;
        }

        int oldQuantity = product.getQuantity();

        int newQuantity =
                oldQuantity + purchaseQuantity;

        product.setQuantity(newQuantity);

        System.out.println("Stock increased successfully.");

        System.out.println(
                product.getProductName()
                        + " quantity = "
                        + product.getQuantity()
        );
    }


    // ================= 10 & 11. REDUCE STOCK =================

    public static void reduceStock(int id, int requestedQuantity) {

        Product product = products.get(id);

        if (product == null) {

            System.out.println("Product not found.");
            return;
        }

        int availableQuantity =
                product.getQuantity();


        // HARD LOGIC

        if (requestedQuantity > availableQuantity) {

            System.out.println("Sale cannot be completed.");
            System.out.println("Insufficient stock.");

            return;
        }


        int newQuantity =
                availableQuantity - requestedQuantity;

        product.setQuantity(newQuantity);

        System.out.println("Sale completed successfully.");

        System.out.println(
                product.getProductName()
                        + " quantity = "
                        + product.getQuantity()
        );
    }


    // ================= 12. CATEGORY-WISE VALUE =================

    public static void categoryWiseInventoryValue() {

        Map<String, Double> categoryMap =
                new HashMap<>();

        for (Product product : products.values()) {

            String category =
                    product.getCategory();

            double value =
                    product.getPrice()
                            * product.getQuantity();


            if (categoryMap.containsKey(category)) {

                double oldValue =
                        categoryMap.get(category);

                categoryMap.put(
                        category,
                        oldValue + value
                );

            } else {

                categoryMap.put(
                        category,
                        value
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


    // ================= 13. REMOVE INACTIVE PRODUCTS =================

    public static void removeInactiveProducts() {

        Iterator<Map.Entry<Integer, Product>> iterator =
                products.entrySet().iterator();


        while (iterator.hasNext()) {

            Map.Entry<Integer, Product> entry =
                    iterator.next();

            Product product =
                    entry.getValue();


            if (product.getStatus()
                    .equalsIgnoreCase("INACTIVE")) {

                iterator.remove();
            }
        }

        System.out.println(
                "Inactive products removed successfully."
        );
    }


    // ================= DISPLAY ALL =================

    public static void displayAllProducts() {

        if (products.isEmpty()) {

            System.out.println("No products available.");
            return;
        }

        for (Product product : products.values()) {

            System.out.println(product);
        }
    }


    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ================= SAMPLE DATA =================

        products.put(
                101,
                new Product(
                        101,
                        "Laptop",
                        "Electronics",
                        65000,
                        10,
                        "Dell",
                        "ACTIVE"
                )
        );


        products.put(
                102,
                new Product(
                        102,
                        "Mouse",
                        "Electronics",
                        800,
                        50,
                        "Logitech",
                        "ACTIVE"
                )
        );


        products.put(
                103,
                new Product(
                        103,
                        "Chair",
                        "Furniture",
                        5000,
                        4,
                        "Supreme",
                        "ACTIVE"
                )
        );


        products.put(
                104,
                new Product(
                        104,
                        "Keyboard",
                        "Electronics",
                        1500,
                        2,
                        "HP",
                        "ACTIVE"
                )
        );


        products.put(
                105,
                new Product(
                        105,
                        "Table",
                        "Furniture",
                        7000,
                        0,
                        "IKEA",
                        "INACTIVE"
                )
        );


        // ================= MENU =================

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("   PRODUCT INVENTORY MANAGEMENT");
            System.out.println("==================================");

            System.out.println("1.  Add Product");
            System.out.println("2.  Update Product");
            System.out.println("3.  Delete Product");
            System.out.println("4.  Search Product By ID");
            System.out.println("5.  Search Product By Category");
            System.out.println("6.  Total Inventory Value");
            System.out.println("7.  Most Expensive Product");
            System.out.println("8.  Low Stock Products");
            System.out.println("9.  Increase Stock After Purchase");
            System.out.println("10. Reduce Stock After Sale");
            System.out.println("11. Category-wise Inventory Value");
            System.out.println("12. Remove Inactive Products");
            System.out.println("13. Display All Products");
            System.out.println("0.  Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {


                // ================= ADD =================

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Supplier: ");
                    String supplier = sc.nextLine();

                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();


                    Product product =
                            new Product(
                                    id,
                                    name,
                                    category,
                                    price,
                                    quantity,
                                    supplier,
                                    status
                            );


                    addProduct(product);

                    break;


                // ================= UPDATE =================

                case 2:

                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    updateProduct(updateId, sc);

                    break;


                // ================= DELETE =================

                case 3:

                    System.out.print("Enter Product ID: ");
                    int deleteId = sc.nextInt();

                    deleteProduct(deleteId);

                    break;


                // ================= SEARCH ID =================

                case 4:

                    System.out.print("Enter Product ID: ");
                    int searchId = sc.nextInt();

                    searchById(searchId);

                    break;


                // ================= SEARCH CATEGORY =================

                case 5:

                    System.out.print("Enter Category: ");
                    String searchCategory = sc.nextLine();

                    searchByCategory(searchCategory);

                    break;


                // ================= TOTAL VALUE =================

                case 6:

                    System.out.println("\nTotal Inventory Value:");

                    totalInventoryValue();

                    break;


                // ================= EXPENSIVE =================

                case 7:

                    System.out.println("\nMost Expensive Product:");

                    mostExpensiveProduct();

                    break;


                // ================= LOW STOCK =================

                case 8:

                    System.out.println("\nLow Stock Products:");

                    lowStockProducts();

                    break;


                // ================= PURCHASE =================

                case 9:

                    System.out.print("Enter Product ID: ");
                    int purchaseId = sc.nextInt();

                    System.out.print("Enter Purchase Quantity: ");
                    int purchaseQuantity = sc.nextInt();


                    increaseStock(
                            purchaseId,
                            purchaseQuantity
                    );

                    break;


                // ================= SALE =================

                case 10:

                    System.out.print("Enter Product ID: ");
                    int saleId = sc.nextInt();

                    System.out.print("Enter Sale Quantity: ");
                    int saleQuantity = sc.nextInt();


                    reduceStock(
                            saleId,
                            saleQuantity
                    );

                    break;


                // ================= CATEGORY VALUE =================

                case 11:

                    System.out.println(
                            "\nCategory-wise Inventory Value:"
                    );

                    categoryWiseInventoryValue();

                    break;


                // ================= REMOVE INACTIVE =================

                case 12:

                    removeInactiveProducts();

                    break;


                // ================= DISPLAY =================

                case 13:

                    System.out.println("\nAll Products:");

                    displayAllProducts();

                    break;


                // ================= EXIT =================

                case 0:

                    System.out.println(
                            "Thank you for using Inventory System."
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