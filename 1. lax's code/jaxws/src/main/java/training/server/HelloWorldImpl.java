package training.server;

import javax.jws.WebService;
 
//Service Implementation
@WebService
public class HelloWorldImpl implements HalloInterface {
 

    @Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
        

    @Override
	public String getHelloWorld(String name) {
		return "Webservice " + name;
	}
        
    @Override
        public String getAbc() {
            return "abc";
        }
 
}
