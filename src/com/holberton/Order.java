package com.holberton;
import java.util.ArrayList;
import java.util.List;

public class Order implements Cart{
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    @Override
    public void removeProduct(Product product) {
        products.remove("Product removed: " + product.getName());    
    }

    @Override
    public int total() {
        return products.size();
    }

}