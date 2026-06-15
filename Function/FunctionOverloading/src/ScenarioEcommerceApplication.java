/*
3.	E-Commerce Application
In an e-commerce website, the placeOrder() functionality should support ordering a single product, multiple products, and products with a discount coupon. How would you use method overloading for the placeOrder () method?
Scenario: Customers can place orders in different ways.
Case 1: The customer purchases a single product.
              Case 2: The customer purchases multiple products at once.
Case 3: The customer purchases products and also applies a discount coupon
All these actions perform the same task of placing an order, but they require different input data.

 */
public class ScenarioEcommerceApplication {

    public void placeOrder(String ProdId,int Qty){
        System.out.println("\n Case 1: The customer purchases a single product.");
        System.out.println("Product ID: "+ProdId);
        System.out.println("Quantity:"+Qty);
        System.out.println("Order placed");

    }

    public void placeOrder(String ProdId1,String ProdID2){
        System.out.println("\n Case 2: The customer purchases multiple products at once.");
        System.out.println("Product ID: "+ProdId1);
        System.out.println("Product ID: "+ProdID2);
        System.out.println("Ordered");

    }

    public void placeOrder(String ProdId,int Qtys,String cuponCode){
        System.out.println("\n Case 3: The customer purchases products and also applies a discount coupon");
        System.out.println("Product ID : "+ProdId);
        System.out.println("Quantity : "+Qtys);
        System.out.println("CuponCode : "+cuponCode);

    }

    public static void main(String[] args) {
      ScenarioEcommerceApplication ec=new ScenarioEcommerceApplication();

      ec.placeOrder("Prod12",4);
      ec.placeOrder("Prod12","Prod13");
      ec.placeOrder("Prod12",3,"Code2026");


    }
}
