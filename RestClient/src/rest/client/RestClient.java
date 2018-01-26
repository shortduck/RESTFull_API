package rest.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;


import org.glassfish.jersey.client.ClientConfig;


public class RestClient {
	
	public static void main(String[] args) {
       
        
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(getBaseURI());
                
        
        String xmlResponse = target.path("rest").path("helloworld").request()
                .accept(MediaType.TEXT_HTML).get(String.class);
        System.out.println(xmlResponse);
        
        
        String xmlResponse3 = target.path("rest").path("helloworld").request()
                .accept(MediaType.TEXT_PLAIN).get(String.class);
        System.out.println(xmlResponse3);

        
        String xmlResponse2 = target.path("rest").path("helloworld").request()
                .accept(MediaType.TEXT_XML).get(String.class);
        System.out.println(xmlResponse2);        
        
        
        // Get XML for application
        String xmlAppResponse =target.path("rest").path("helloworld").request()
                .accept(MediaType.APPLICATION_XML).get(String.class);
                System.out.println(xmlAppResponse);
                
         
        // Get JSON for application
        String jsonResponse = target.path("rest").path("helloworld").request()
                .accept(MediaType.APPLICATION_JSON).get(String.class);

               
        System.out.println(jsonResponse);
        
}

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/RESTful_All").build();
    }

}
