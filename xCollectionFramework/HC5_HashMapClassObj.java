package xCollectionFramework;

import java.util.HashMap;
import java.util.List;

class Product{
    private String productID;
    private String pName;
    private double pPrice;
    Product(String productID,String pName,double pPrice){
        this.productID = productID;
        this.pName = pName;
        this.pPrice = pPrice;
    }

    public String getProductID() {
        return productID;
    }

    public String getpName() {
        return pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    @Override
    public String toString(){
        return "Product ID = "+productID+" || Product Name = "+pName+" || Product Price = " +pPrice;
    }
}

public class HC5_HashMapClassObj {
    public static void main(String[] args) {
        Product P1 = new Product("P123","Chips",15);
        Product P2 = new Product("P222","Biscuit",30);
        Product P3 = new Product("P444","MilkPack",70);

        HashMap<Product, Integer> productInventory = new HashMap<>();

        productInventory.put(P1,10);
        productInventory.put(P2,25);
        productInventory.put(P3,20);

        // for display all product
        for (HashMap.Entry<Product, Integer> temp : productInventory.entrySet()) {
            System.out.println(temp.getKey() + " -->Has quantity: " + temp.getValue());
        }

        // Find a product's quantity by its Product object
        int quantity = productInventory.get(P2);
        System.out.println("Quantity of " + P2.getpName() + ": " + quantity);

        // Update the quantity of a product
        productInventory.put(P1, 12);
        System.out.println("Updated quantity of " + P1.getpName() + ": " + productInventory.get(P1));

        // Remove a product from the HashMap
        productInventory.remove(P3);
        System.out.println("After removing " + P3.getpName() + ", the products are: ");
        for (HashMap.Entry<Product, Integer> temp : productInventory.entrySet()) {
            System.out.println(temp.getKey() + " has quantity: " + temp.getValue());
        }


    }
}
