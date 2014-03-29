/*
 *author:weichangying
 *date:2014-03-29
 *remark:then app main entry,that will do the job for initialization everything of the system need.
 */
package com.xuanwu.xtion.web;
 
import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

import java.io.IOException;
import java.net.URI;

public class main {
	
	/*
	 *define the base URI of the restful servies.
	 *or you can read the IP and Port from the app.xml 
	 */
    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/api/").port(8080).build();
    }
    
    /*
     *base uri property
     */
    public static final URI BASE_URI = getBaseURI();
    
    /*
     *init the server container
     */
    protected static HttpServer initServer() throws IOException { 
        System.out.println("Starting grizzly...");
		app config = new app();
		final HttpServer server=GrizzlyHttpServerFactory.createHttpServer(BASE_URI,config);
		return server;
    }
    
    /*
     *the entry of app 
     */
	public  static void main(String[] args) throws IOException {
        HttpServer httpServer = initServer();
        System.out.println(String.format("Jersey app started with WADL available at "
                + "%sapplication.wadl\nTry out %shelloworld\nHit enter to stop it...",
                BASE_URI, BASE_URI));
        System.in.read();
        httpServer.stop();
    }
}
