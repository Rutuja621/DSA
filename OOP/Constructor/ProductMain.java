import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

   
    void display() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println();
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product arr[] = new Product[5];

      
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Product ID:");
            int id = sc.nextInt();

            System.out.println("Enter Product Name:");
            String name = sc.next();

            System.out.println("Enter Product Price:");
            double price = sc.nextDouble();

            arr[i] = new Product(id, name, price);
        }

 
        Product expensive = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].price > expensive.price) {
                expensive = arr[i];
            }
        }

      
        System.out.println("\nMost Expensive Product:");
        expensive.display();

    }
}