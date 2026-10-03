/*
3.	E-Commerce Application
In an e-commerce website, the placeOrder() functionality should support ordering a single product, multiple products, and products with a discount coupon. How would you use method overloading for the placeOrder () method?
Scenario: Customers can place orders in different ways.
Case 1: The customer purchases a single product.
              Case 2: The customer purchases multiple products at once.
Case 3: The customer purchases products and also applies a discount coupon
All these actions perform the same task of placing an order, but they require different input data.  
*/

public class EcommerceApp{
	
	
	public void placeOrder(int prodId,int Quantity){
		System.out.println("productID: "+prodId+"\nQuantity: "+Quantity);
		
		
	}
	
	
	public void placeOrder(int []product){
		
		for(int i:product){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	
	public void placeOrder(int []prodIds,String cuponCode){
		System.out.println("Cuponcode: "+cuponCode);
			for(int i:prodIds){
			System.out.print(i+" ");
		}
		System.out.println();
		
		
	}
	public static void main(String [] arg){
		
		EcommerceApp app=new EcommerceApp();
	    System.out.println("Case 1");
		
		
		app.placeOrder(2,3);
		
		
	System.out.println("\nCase 2");
		
		int []cart={10,20,30};
		app.placeOrder(cart);
	System.out.println("\nCase 3");
		
		app.placeOrder(cart,"AB123");
		
		
		
		
		
		
	}






}