package com.holberton;

public class ClothingProduct extends Product {
    public String size;

    public ClothingProduct(String size,String name, double price, String reference) {
        super(name, price, reference);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "name= "+name+"price= "+price+"reference= "+reference;
    }
       
}