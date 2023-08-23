package com.example.demo.r1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.r1.model.ProductModel;
import com.example.demo.r1.service.ProductService;

@RestController
public class ProductController {
@Autowired
public ProductService pser;
@PostMapping("/postProduct")
public String postProduct(@RequestBody ProductModel pr ) {
pser.saveProduct(pr);
return "data saved";
}
@GetMapping("/getProduct")
public List<ProductModel> getHotelInfo()
{
	return pser.getProduct();
}
@PutMapping("/updateProduct")
public ProductModel updateProductInfo(@RequestBody ProductModel pm)
{
	return pser.updateProduct(pm);
}

@PutMapping("/updateProductif/{id}")
public ResponseEntity<String> updateProductInfo(@PathVariable int id,@RequestBody ProductModel pm)
 {
	 boolean updated=pser.updateProductif(id,pm);
	 if(updated) {
		 return ResponseEntity.ok("Product with ID "+id+" updated successfully");
	 }
	 else {
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product with ID"+id+"not found");
	 }
 }


@DeleteMapping("/deleteHotel/{id}")
public String removeProduct(@PathVariable("id")int id)
{
	pser.deleteProduct(id);
	return "Hotel with Id"+id+" is deleted";
}
@GetMapping("/user/{userId}")
public ResponseEntity<?> getUserId(@PathVariable int userId){
	  Optional <ProductModel> product=pser.getUserId(userId);
	  if(product != null) {
		  return ResponseEntity.ok(product);
	  }
	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID"+userId+"not found");
}

}
