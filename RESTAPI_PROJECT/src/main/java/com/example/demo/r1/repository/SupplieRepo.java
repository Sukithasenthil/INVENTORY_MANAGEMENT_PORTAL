package com.example.demo.r1.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.r1.model.SupplierModel;

public interface SupplieRepo extends JpaRepository<SupplierModel, Integer>{
	
}
