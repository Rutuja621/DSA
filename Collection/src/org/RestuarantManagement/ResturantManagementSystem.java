package org.RestuarantManagement;
//interface (loose coupling)
//Loose coupling: we use the interface and abstraction instead of concrete class( normal class that has complete implementation)
interface PaymentMethod {

    void pay(double amount);
}

//implementation of payment method

class UPI implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "via UPI");

    }
}


//payment by cash on delivery
class CashonDelivery implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Cash on Delivery");

    }

}

//payment by credit card
class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via CreditCard");

    }
}


abstract class Restuarant {

    private String name;
    private String location;

    public Restuarant(String name, String location) {
        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //abstract methods
    public abstract void prepareFood();

    public abstract double calculateDeliveryCharges();
    public final void companyLogo() {//final method cannot be changed
        System.out.println("=== FoodExpress Company Logo ===");
    }

}

// concrete class(normal class that has complete implementation)
/*
abstract class: Restuarant
concrete class(can be instantiated): PizzaRestuarant,ChineseRestuarant,SouthIndianResturant
 */
class PizzaRestuarant extends Restuarant {
    public PizzaRestuarant(String name, String location) {
        super(name, location);
    }

    @Override
    public void prepareFood() {
        System.out.println("preparing delicious pizza's");
    }

    @Override
    public double calculateDeliveryCharges() {
        return 50.0;
    }
}

class ChineseRestuarant extends Restuarant {
    public ChineseRestuarant(String name, String location) {
        super(name, location);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing delicious chinese");
    }

    @Override
    public double calculateDeliveryCharges() {
        return 25.0;
    }
}

class SouthIndianResturant extends Restuarant {

    public SouthIndianResturant(String name, String location) {
        super(name, location);
    }

    @Override
    public void prepareFood() {
        System.out.println("preparing delicious southIndian Food");

    }

    @Override
    public double calculateDeliveryCharges() {
        return 10.0;
    }
}

public class ResturantManagementSystem {
    public static void main(String[] args) {
        //(dynamic polymorphism)parent reference pointing to child objects(runtime polymorphism)
        Restuarant rs = new ChineseRestuarant("italian chinese", "katraj");
        Restuarant rs1 = new PizzaRestuarant("Domino's pizza", "warje");
        Restuarant rs2 = new SouthIndianResturant("south corner", "karve nagar");

        Restuarant[] rst = {rs, rs1, rs2};

        for (Restuarant r : rst) {
            r.companyLogo();
            System.out.println("Resturant : " + r.getName() + " location: " + r.getLocation() + "/n");
            r.prepareFood();
            double charge = r.calculateDeliveryCharges();
            System.out.println("Delivery charges: " + charge);
            // Loose coupling with PaymentMethod interface
            PaymentMethod pay = new CashonDelivery();
            pay.pay(charge);
            System.out.println();

            // can switch to CreditCard or CashOnDelivery easily
           /* PaymentMethod pay1=new CashonDelivery();
            pay1.pay(charge);

            PaymentMethod pay2=new CashonDelivery();
            pay2.pay(charge);
*/

        }

    }
}
