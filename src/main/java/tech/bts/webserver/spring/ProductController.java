package tech.bts.webserver.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.bts.webserver.data.Product;
import tech.bts.webserver.data.ProductDatabase;
import tech.bts.webserver.spring.util.TemplateUtil;

import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/products")
    public String index(@RequestParam(value = "maxPrice", required = false) Integer maxPrice) throws Exception {

        ProductDatabase db = new ProductDatabase();
        List<Product> products;

        if(maxPrice == null) {
           products = db.getProducts();
        } else {
           products = db.getProductsLessThan(maxPrice);
        }

        // Static method: call Class.method() & cannot access Fields of the Class;
        // Non-static method: call Object.method() or Variable.method();

        String html = TemplateUtil.createHtml("public/product.html", products);

        return html;
    }
}