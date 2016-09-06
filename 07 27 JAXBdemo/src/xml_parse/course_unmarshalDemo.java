/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml_parse;


import xml_parse.Shiporder;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class course_unmarshalDemo {

    public static void main(String[] args) {

        try {

            File file = new File("src/data/shiporder.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Shiporder.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Shiporder customer = (Shiporder) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer);
            System.out.println(customer.getOrderid());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
