package org.richard.web.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int sku;
	private String name;
	private String detail;
	
	public Product(){};
	
	public Product(int sku, String name, String detail){
		this.sku = sku;
		this.name = name;
		this.detail = detail;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
