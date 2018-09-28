package tech.bts.webserver.data;

import java.util.Arrays;
import java.util.List;

public class PurchaseDatabase {

    public List<Purchase> purchases;

    ProductDatabase db = new ProductDatabase();
    List<Product> products = db.getProducts();

    public PurchaseDatabase() {

        Purchase p1 = new Purchase("2018-9-24", 98, products.get(2));
        Purchase p2 = new Purchase("2018-9-25", 292, products.get(1));
        Purchase p3 = new Purchase("2018-9-26", 123, products.get(0));

        this.purchases = Arrays.asList(p1, p2, p3);
    }

    public List<Purchase> getPurchases() {

        return this.purchases;
    }
}
