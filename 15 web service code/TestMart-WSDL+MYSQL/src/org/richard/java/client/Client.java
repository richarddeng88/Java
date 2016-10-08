
package org.richard.java.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.richard.java.Product_Catalog_Interface;
import java.net.URL;

public class Client {

    public static void main(String args[ ]) throws Exception {

        URL url = new URL("http://localhost:1234/productcatalog?wsdl");

        QName qname = new QName("http://testmart.com", "TstMartService009");

        // Create, in effect, a factory for the service.
        Service service = Service.create(url, qname);
        
        // Extract the endpoint interface, the service "port".
        
        Product_Catalog_Interface eif = service.getPort(Product_Catalog_Interface.class);
        System.out.println(eif.getProductCatalog());
        System.out.println(eif.getDetailFromDB());
        System.out.println(eif.addDetailintoDB(202,"movie","suiside"));
    }
}