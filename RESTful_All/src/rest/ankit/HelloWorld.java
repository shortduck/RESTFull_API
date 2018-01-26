package rest.ankit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/helloworld")
public class HelloWorld {	
	
	/*
	 * Rules regarding "return"
	 * 1. MediaType.TEXT_PLAIN,MediaType.TEXT_HTML MUST return String.
	 * 2. MediaType.APPLICATION_XML, APPLICATION_JSON MUST return Object, with class annoted with XMLRootElement.
	 * 3. MediaType.TEXT_XML can either return String or an Object. 
	 */
		
    @GET
	@Produces({MediaType.TEXT_PLAIN})
    public String HelloWorldText2(){
		return "Hello World, Jersey";
	}
	
    @GET
	@Produces({MediaType.TEXT_XML})
	public Message getHelloWorldXML(){
		return new Message("Hello World, Jersey");
    	//return ("Hello World, Jersey");
	}
	
	@GET
	@Produces({MediaType.TEXT_HTML})
	public String HelloWorldText(){
		return "Hello World, Jersey";
	}

    @GET
	@Produces({MediaType.APPLICATION_XML})
	public Message getXML(){
		return new Message("Hello World, Jersey");
	}

    
    // This method is called if JSON is requested
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Message getJSON_Ankit() {
        return new Message("Hello World, Jersey");
    }
    
    
    
	

}
