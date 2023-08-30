package com.example.demo.r1.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.r1.model.ProductModel;

import jakarta.transaction.Transactional;

public interface ProductRepo extends JpaRepository<ProductModel, Integer>{
	@Query(value="select * from product",nativeQuery = true )
	public List<ProductModel>getAllrows();
	
	//delete
	@Modifying
	@Transactional
	//@Query(value = "delete from product where prodId=:id",nativeQuery=true)
	@Query("Delete from ProductModel h where h.prodId=:id")
	public int deleteId(@Param("id") int id);
}
