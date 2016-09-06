
package training.server;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld_Interface {
 
	@WebMethod String getHelloWorldAsString(String name);
        
        @WebMethod String getHelloWorld(String name);
 
}
