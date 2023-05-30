package com.holberton;

public class BookProduct extends Product{
    private String author;

    public BookProduct(String author,String name, double price, String reference) {
        super(name, price, reference);
        this.author=author;
    }

    @Override
    public String getDescription() {
        return "name= "+name+"price= "+price+"reference= "+reference;
    }

}