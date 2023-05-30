package com.holberton;

public abstract class Product {
        protected  String name;
        protected static  double price;
        protected  String reference; 
            
    public Product(String name2, double price2, String reference2) {
        this.name=name;
        this.price=price;
        this.reference=reference;
    }



public void setname(String name){
    this.name=name;
}
public void setprice(double price){
    this.price=price;
}
public void setreference(String reference){
    this.reference=reference;
}
public void getname(String name){
    this.name=name;
}
public void getprice(double price){
    this.price=price;
}
public void getreference(String reference){
    this.reference=reference;
}
public abstract String getDescription();



public String getName() {
    return null;
}

}
