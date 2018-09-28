package tech.bts.webserver.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.bts.webserver.data.Purchase;
import tech.bts.webserver.data.PurchaseDatabase;

import java.io.IOException;
import java.util.List;

@RestController
public class PurchaseApiController {

    @RequestMapping(value = "/api/purchases", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Purchase> index() throws IOException {

        PurchaseDatabase dbp = new PurchaseDatabase();

        List<Purchase> purchases = dbp.getPurchases();

        return purchases;
    }
}
