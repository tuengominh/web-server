package tech.bts.webserver.data;

// DTO: Data Class

public class Purchase {

    private String date;
    private int quantity;
    private Product product;


    public Purchase(String date, int quantity, Product product) {
        this.date = date;
        this.quantity = quantity;
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity; }

    public Product getProduct() {
        return product;
    }

    public String toString() {
        return this.product + " - " + this.date + " - " + this.quantity + "units left";

    }
}
