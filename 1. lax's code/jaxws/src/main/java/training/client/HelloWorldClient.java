package training.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceFeature;


public class HelloWorldClient {
    
	public static void main(String[] args) throws Exception {
	
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorld_Interface2 test = service.getHelloWorldImplPort();
        System.out.println(test.getHelloWorldAsString("JAXWS service"));

    }
}
