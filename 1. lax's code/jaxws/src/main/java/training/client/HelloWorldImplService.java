package training.client;


import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;



@WebServiceClient(name = "HelloWorldImplService", targetNamespace = "http://server.training.techseekers.edu/", wsdlLocation = "http://localhost:9992/ws/hello?wsdl")
public class HelloWorldImplService extends Service {

    private final static URL H_WSDL_LOCATION;
    private final static WebServiceException H_EXCEPTION;
    private final static QName H_QNAME = new QName("http://server.training.techseekers.edu/", "HelloWorldImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1233/new?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        H_WSDL_LOCATION = url;
        H_EXCEPTION = e;
    }

    public HelloWorldImplService() {
        super(__getWsdlLocation(), H_QNAME);
    }

    public HelloWorldImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), H_QNAME, features);
    }

    public HelloWorldImplService(URL wsdlLocation) {
        super(wsdlLocation, H_QNAME);
    }

    public HelloWorldImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, H_QNAME, features);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld_Interface2 getHelloWorldImplPort() {
        return super.getPort(new QName("http://server.training.techseekers.edu/", "HelloWorldImplPort"), HelloWorld_Interface2.class);
    }

    
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld_Interface2 getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.training.techseekers.edu/", "HelloWorldImplPort"), HelloWorld_Interface2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (H_EXCEPTION!= null) {
            throw H_EXCEPTION;
        }
        return H_WSDL_LOCATION;
    }

}
