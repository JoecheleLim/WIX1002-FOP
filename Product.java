/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
public class Product {
    private String name;
    private double price;
    private int stock;
    
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void reduceStock(int qty) {
        if (qty>0 && stock >= qty) {
            stock -= qty;
        } else 
            System.out.println("Insufficient stock or invalid quantity.");
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s\nPrice: %.2f\n", name, price);
    }
}

class Order {
    private Product[] products;
    private int size = 0;
    public Order() {
        products = new Product[100];
    }
    
    public Product[] getProductList() {
        return products;
    }
    
    public void addProduct(Product product) {
        this.products[size++] = product;
    }
    
    public void removeProduct(Product product) {
        boolean found =false;
        for (int i = 0; i<size; i++) {
            if (products[i].getName().equalsIgnoreCase(product.getName())) {
                for(int j = i; j<size; j++) {
                    products[j] = products[j+1];
                }
                
                products[--size] = null;
                return;
            }
        }
        
        if(!found) {
            System.out.println("No product found!");
        }
    }
    
    public double calculateTotal() {
        double total = 0;
        for(int i=0; i<size; i++) {
            if (products[i].getStock() != 0)
                total += (double)(products[i].getPrice());
        }
        
        return total;
    }
    
    @Override
    public String toString() {
        String text = "Product: \n";
        for(int i = 0; i<size; i++) {
            if (products[i].getStock() != 0)
                text = text + String.format("- %s: RM%.2f\n", products[i].getName(), products[i].getPrice());
        }
        
        return String.format("%s\nTotal: RM%.2f\n", text, calculateTotal());
    }
}

class Customer {
    private final String name, email, shippingAddress;
    
    public Customer(String name, String email, String shippingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getShippingAddress() {
        return shippingAddress;
    }
    
    @Override
    public String toString() {
        return String.format("Customer: \nName: %s\nEmail: %s\nShipping Address: %s\n", name, email, shippingAddress);
    }
}

class Inventory{
    private Product[] productStock;
    private static int[] stockCounts;
    private int size = 0;
    
    public Inventory() {
        productStock = new Product[100];
        stockCounts = new int[100];
    }
    
    public static int[] getStockCounts() {
        return stockCounts;
    }
    
    public void addProduct(Product product, int qty) {
        for(int i = 0; i<size; i++) {
            if (productStock[i].getName().equalsIgnoreCase(product.getName())) {
                stockCounts[i] = qty;
                return;
            }
        }
        
        productStock[size] = product;
        stockCounts[size] = qty;
        size++;
    }
    
    public boolean isAvailable(Product product, int qty) {
        for(int i = 0; i<size; i++) {
            if (productStock[i].getName().equalsIgnoreCase(product.getName())) {
               if(stockCounts[i] >= qty) {
                   return true;
               } 
            }
        }
        return false;
    }
    
    public void updateStock(Product product, int qty) {
        for(int i = 0; i<size; i++) {
            if (productStock[i].getName().equalsIgnoreCase(product.getName()) && stockCounts[i] >= qty) {
                stockCounts[i] -= qty;
                return;
            }
        }
    }
}

class Invoice {
    private Order order;
    private Customer customer;
    
    public Invoice(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }
    
    @Override
    public String toString() {
        return String.format("Invoice for %s\nShipping Address: %s\n\n", customer.getName(), customer.getShippingAddress()) + order.toString();
    }
}