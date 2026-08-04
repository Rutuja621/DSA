package org.List.com.Vector;

import java.util.Vector;

class Product{
    private String id;
    private String name;
    private double price;

    Product(String id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class ProductReturn {
    public static void main(String[] args) {
        Vector<Product> p=new Vector<>();
        p.add(new Product("P1","Mouse",500));
        p.add(new Product("P2","keyboard",320));
        p.add(new Product("P3","pendrive",250));

        for(Product ps:p){
            if(ps.getPrice()<500){
                System.out.println("id: "+ps.getId()+"product_name: "+ps.getName()+"price: "+ps.getPrice());
            }
        }


    }
}
