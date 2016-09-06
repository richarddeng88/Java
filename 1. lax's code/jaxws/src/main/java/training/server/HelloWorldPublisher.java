package training.server;

import javax.xml.ws.Endpoint;
 
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:4541/news", new HelloWorldImpl());
    }
}
    