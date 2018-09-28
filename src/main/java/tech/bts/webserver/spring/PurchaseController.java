package tech.bts.webserver.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.bts.webserver.data.Purchase;
import tech.bts.webserver.data.PurchaseDatabase;
import tech.bts.webserver.spring.util.TemplateUtil;

import java.util.List;

@RestController
public class PurchaseController {
    @RequestMapping("/purchases")
    public String index() throws Exception {

        PurchaseDatabase dbp = new PurchaseDatabase();

        List<Purchase> purchases;
        purchases = dbp.getPurchases();

        String html = TemplateUtil.createHtml("public/purchase.html", purchases);

        return html;
    }
}
