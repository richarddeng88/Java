package org.richard.java;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.richard.java.model.Product;

@WebService(name = "TestMartCatalog001" )
// one annotation reqired to make this class as a service.... coooooool
// this is the web service class

public interface Product_Catalog_Interface {

	@WebMethod(operationName = "fetch_Categories", action="fetch_00000001")
	public abstract List<String> getProductCatalog();

	@WebMethod(operationName = "get_product_info")
	public abstract List<String> getProduct(String category);

	@WebMethod(operationName = "get_product_info_v2")
	@WebResult(name="Book_Product")
	public abstract List<Product> get_Product_v2(String category);

	@WebMethod(operationName = "add_product_info")
	public abstract boolean addProduct(String category, String product);

	public abstract String getDetailFromDB();
	
	public abstract boolean addDetailintoDB(int sku, String name, String detail);


}