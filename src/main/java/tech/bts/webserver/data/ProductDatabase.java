package tech.bts.webserver.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDatabase {

    public List<Product> products;

    public ProductDatabase() {

        Product p1 = new Product("iPhone", 1000);
        Product p2 = new Product("MacBook", 2200);
        Product p3 = new Product("iPad", 1200);

        this.products = Arrays.asList(p1, p2, p3);
    }

    public List<Product> getProducts() {

        return this.products;
    }

    public List<Product> getProductsLessThan(int maxPrice) {

        List<Product> result = new ArrayList<>();

        for (Product product : products) {
            if (product.price <= maxPrice) {
                result.add(product);
            }
        }
        return result;
    }
}
