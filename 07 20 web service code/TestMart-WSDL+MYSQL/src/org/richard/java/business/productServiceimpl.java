package org.richard.java.business;

import java.util.ArrayList;
import java.util.List;

import org.richard.java.model.Product;

public class productServiceimpl {
	
	List<String> bookList = new ArrayList<>();	
	List<String> musicList = new ArrayList<>();	
	List<String> movieList = new ArrayList<>();	
	
	public productServiceimpl(){
		bookList.add("Inference");
		bookList.add("Regression");
		
		musicList.add("blue sky");
		musicList.add("solo piano");
		musicList.add("peace");
		
		movieList.add("mission impossible 1");
		movieList.add("green arrow");
		movieList.add("bat man 3");
		
	}
	
	public List<String> getProductCatalog(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");	
		return categories;	
	}
	
	public List<String> getProduct(String category){
		switch (category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movie":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product){
		switch (category.toLowerCase()){
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movie":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
	
	public List<Product> get_product_v2(String category){
		List<Product> product_list = new ArrayList<>();
		product_list.add(new Product("java book", "1234", 128.12));
		product_list.add(new Product(".net book", "1343", 98.22));
		product_list.add(new Product("c++ book", "1124", 45.25));
		return product_list;
	}
}






