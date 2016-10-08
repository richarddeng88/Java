package org.richard.java;


import java.util.List;

import javax.jws.WebService;

import org.richard.java.business.productFromDB;
import org.richard.java.business.productServiceimpl;
import org.richard.java.model.Product;


@WebService(endpointInterface="org.richard.java.Product_Catalog_Interface",
targetNamespace = "http://testmart.com",
portName="TestMartPort000", serviceName="TstMartService009")
// this should be the only annotation in this java class. the rest should be in the SEI. 

public class ProductCatalog implements Product_Catalog_Interface {
	
	productServiceimpl productService = new productServiceimpl();
	productFromDB productDB = new productFromDB();
	
	@Override
	public List<String> getProductCatalog(){
		return productService.getProductCatalog();
	}

	
	@Override
	public List<String> getProduct(String category){
		return productService.getProduct(category);
	}
	
	
	@Override
	public List<Product> get_Product_v2(String category){
		return productService.get_product_v2(category);
	}

	
	@Override
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}
	
	@Override
	public String getDetailFromDB(){
		return productDB.get_product_detail();
	}
	
	@Override
	public boolean addDetailintoDB(int sku, String name, String detail){
		return productDB.add_product_to_DB(sku, name, detail);
		}
}



