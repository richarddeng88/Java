package org.richard.web.messenger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.richard.web.messenger.model.Product;
import org.richard.web.messenger.service.ProductDB;

@Path("/products")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ProductResource {
	
	ProductDB product_service = new ProductDB();
	
	@GET
	public Product getProduct(){
	return product_service.get_product_detail2();
	}
}
