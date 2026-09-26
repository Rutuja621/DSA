public class EccomerceApp {
   public void placeOrder(String prodNme,double price){
       System.out.println("Product Name: "+prodNme);
       System.out.println("Price: "+price);
   }

    public void placeOrder(String []prods,double totalPrice){

       for(int i=0;i<prods.length;i++){
           System.out.println("Products : "+prods[i]);
       }

        System.out.println("Price: "+totalPrice);

    }


    public void placeOrder(String []prods,double totalPrice,String cupon){

        for(int i=0;i<prods.length;i++){
            System.out.println("Products : "+prods[i]);
        }

        System.out.println("Cupon: "+cupon);
        System.out.println("Price: "+totalPrice);

    }
    public static void main(String[] args) {
       EccomerceApp e=new EccomerceApp();
        e.placeOrder("Laptop", 50000);
        System.out.println();
        // Case 2
        String[] products = {"Laptop", "Mouse", "Keyboard"};
        e.placeOrder(products, 55000);
        System.out.println();
        // Case 3
        e.placeOrder(products, 55000, "SAVE10");
    }
}
