
package training.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;

@WebService(name = "HelloWorldTest", targetNamespace = "http://webservices.concepts.edu/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld_Interface2 {


    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices.concepts.edu/HelloWorldTest/getHelloWorldAsStringRequest", output = "http://webservices.concepts.edu/HelloWorldTest/getHelloWorldAsStringResponse")
    public String getHelloWorldAsString(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);
    

    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices.concepts.edu/HelloWorldTest/getHelloWorldRequest", output = "http://webservices.concepts.edu/HelloWorldTest/getHelloWorldResponse")
    public String getHelloWorld(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
