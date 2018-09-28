package tech.bts.webserver.jetty;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import tech.bts.webserver.data.Product;
import tech.bts.webserver.data.ProductDatabase;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SimpleHandler extends AbstractHandler {
    @Override
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response) throws IOException {

        ProductDatabase db = new ProductDatabase();
        List<Product> products = db.getProducts();

        System.out.println("URI: " + request.getRequestURI());

        PrintWriter out = response.getWriter();
        response.setStatus(HttpServletResponse.SC_OK);

        out.println("<h1>Products</h1>");

        for (Product product : products) {
            out.println("<p>" + product + "</p>");
        }

        baseRequest.setHandled(true);
    }
}

