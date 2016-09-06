package org.richard.java.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Product999")
// tell JAXB this is the root element of XML.
@XmlType(propOrder={"price","sku","name"})

public class Product {
	private String name;
	private String sku;
	private double price;
	
	public Product(){
		// we need a null element constructor for JAXB because JAXB will clear content before creating
		// a new instance. 
	}
	
	public Product(String name, String sku, double price){
		this.name = name;
		this.price = price;
		this.sku = sku;
	}
	
	@XmlElement(name="Product_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
