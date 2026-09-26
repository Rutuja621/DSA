package org.OnlineShoppingApplication;

// Interface for Return and Exchange Policies
interface Returnable {
    void returnProduct();
    void exchangeProduct();
}

// Abstract superclass Product
abstract class Product implements Returnable {
    private final String productId;  // Product ID should remain constant
    protected String name;
    protected double price;

    // Constructor using super()
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();

    // Final method for tax calculation (cannot be overridden)
    public final double calculateTax() {
        return price * 0.10; // 10% tax
    }

    // Common purchase method (loose coupling via Product reference)
    public void purchase() {
        System.out.println("Purchasing product: " + name + " | Final Price: " + (price - calculateDiscount() + calculateTax()));
    }

    public String getProductId() {
        return productId;
    }

    // Implementing Returnable interface
    @Override
    public void returnProduct() {
        System.out.println(name + " has been returned.");
    }

    @Override
    public void exchangeProduct() {
        System.out.println(name + " has been exchanged.");
    }
}

// Subclass Electronics
class Electronics extends Product {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.15; // 15% discount
    }
}

// Subclass Clothing
class Clothing extends Product {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.25; // 25% discount
    }
}

// Subclass Books
class Books extends Product {
    public Books(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}

// Utility class
class Utility {
    public static void printMessage() {
        System.out.println("Utility class method");
    }
}

// Child Utility class demonstrating method hiding
class ChildUtility extends Utility {
    public static void printMessage() {
        System.out.println("Child Utility class method (method hiding)");
    }
}

// Main class to demonstrate functionality
public class OnlineShoppingApp {
    public static void main(String[] args) {
        // Dynamic Polymorphism: purchase using Product reference
        Product p1 = new Electronics("E101", "Laptop", 50000);
        Product p2 = new Clothing("C202", "T-Shirt", 2000);
        Product p3 = new Books("B303", "Java Programming", 800);

        p1.purchase();
        p2.purchase();
        p3.purchase();

        // Return and Exchange
        p1.returnProduct();
        p2.exchangeProduct();

        // Method Hiding demonstration
        Utility.printMessage();       // Calls parent static method
        ChildUtility.printMessage();  // Calls child static method
    }
}
