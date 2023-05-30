package com.holberton;



public class ElectronicProduct extends Product {
    private double power;
    
    
    public ElectronicProduct(double power,String name , double price , String reference) {
        super(name, price, reference); 
        this.power = power;
    }
    
    @Override
    public String getDescription() {
      return "name= "+name+"price= "+price+"refrence= "+reference;
    }    
}