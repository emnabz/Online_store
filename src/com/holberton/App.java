package com.holberton;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    class Product {
        protected String name;
        protected static double price;
    
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    
        public String getDescription() {
            return "Name: " + name + ", Price: $" + price;
        }
    }
    
    class ElectronicProduct extends Product{
        private double power;

        public ElectronicProduct(String name, double price, double power) {
            super(name, price);
            this.power = power;
        }
        
        @Override
        public String getDescription() {
            return super.getDescription() + ", price: " + price;
        }
    }
    class ClothingProduct extends Product {
        private String size;
        public ClothingProduct(String name, double price, String size) {
            super(name, price);
            this.size = size;
        }
            @Override
            public String getDescription() {
                return super.getDescription() +  ", Author " + size;
            }
        }
    class BookProduct extends Product {
        private String author;
        public BookProduct(String author, String name) {
            super(name, price);
            this.author = author;
        }
        @Override
        public String getDescription() {
           return super.getDescription() +  ", Author " + author;
        }
    }

    class Order implements Cart {
        private List<Product> products;
    
        public Order() {
            products = new ArrayList<>();
        }
    
        @Override
        public void addProduct(Product product) {
            products.add(product);
        }
    
        @Override
        public void removeProduct(Product product) {
            products.remove(product);
        }
    
        @Override
        public double calculateTotal() {
            double total = 0.0;
            for (Product product : products) {
                total += product.price;
            }
            return total;
        }

    }
    
    
}
    

