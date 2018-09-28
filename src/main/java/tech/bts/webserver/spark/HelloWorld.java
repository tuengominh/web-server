package tech.bts.webserver.spark;

import tech.bts.webserver.data.ProductDatabase;
import tech.bts.webserver.data.Product;

import java.util.List;

import static spark.Spark.*;

public class HelloWorld {

    public static void main(String[] args) {

        get("/products", (req, res) -> {

            ProductDatabase db = new ProductDatabase();
            List<Product> products = db.getProducts();

            String result = "";
            result += "<h1>Products</h1>";

            for (Product product : products) {
                result += "<p>" + product + "</p>";
            }
            return result;
        });
    }
}