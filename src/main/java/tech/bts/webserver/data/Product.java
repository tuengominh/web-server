package tech.bts.webserver.data;

public class Product {

    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return this.name + " - " + this.price + "$";

    }
}