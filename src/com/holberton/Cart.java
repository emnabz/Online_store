package com.holberton;

public interface Cart {
        void addProduct(Product product);
        void removeProduct(Product product);
        int total();
    }   
