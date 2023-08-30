package com.example.demo.r1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.r1.model.InventoryModel;

public interface InventoryRepo extends JpaRepository<InventoryModel, Integer> {

}
