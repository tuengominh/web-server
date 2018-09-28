package tech.bts.webserver.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.bts.webserver.data.Product;
import tech.bts.webserver.data.ProductDatabase;

import java.io.IOException;
import java.util.List;

@RestController
public class ProductApiController {

    @RequestMapping(value = "/api/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> index(@RequestParam(value = "maxPrice", required = false) Integer maxPrice) throws IOException {

        ProductDatabase db = new ProductDatabase();

        List<Product> products;

        if (maxPrice == null) {
            products = db.getProducts();
        } else {
            products = db.getProductsLessThan(maxPrice);
        }

        return products;
    }
}
