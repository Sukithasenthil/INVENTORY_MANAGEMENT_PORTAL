package com.example.demo.r1.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.r1.model.ProductModel;
import com.example.demo.r1.repository.ProductRepo;

@Service
public class ProductService {
@Autowired
public ProductRepo prepo;
public String saveProduct(ProductModel h) {
	prepo.save(h);
	return "Data is saved to database";
}
public List<ProductModel> getProduct()
{
	return prepo.findAll();
}
public ProductModel updateProduct(ProductModel pm)
{
	return prepo.saveAndFlush(pm);
}
 
public boolean updateProductif(int ProductId,ProductModel pm)
{
	if(prepo.existsById(ProductId)) {
		prepo.save(pm);
		return true;
	}
	return false;
}



public void deleteProduct(int product_id)
{    
	System.out.println("Deleted");
	prepo.deleteById(product_id);
}
public Optional<ProductModel> getUserId(int userId){
	Optional<ProductModel>product=prepo.findById(userId);
	
	if(product.isPresent()) {
		return product;
	}
	return null;
}
}
