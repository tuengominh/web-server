package tech.bts.webserver.jetty;

import org.eclipse.jetty.server.handler.ContextHandler;

public class MainServer {

    public static void main( String[] args ) throws Exception
    {
        org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(8080);

        ContextHandler contextHandler = new ContextHandler("/products");
        contextHandler.setHandler(new SimpleHandler());

        server.setHandler(contextHandler);

        server.start();
        server.join();
    }
}
