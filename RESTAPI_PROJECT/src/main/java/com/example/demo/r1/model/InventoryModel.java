package com.example.demo.r1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InventoryModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int invenid;
private int quantity;
private int stockvalue;
private String status;
public int getInvenid() {
	return invenid;
}
public void setInvenid(int invenid) {
	this.invenid = invenid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getStockvalue() {
	return stockvalue;
}
public void setStockvalue(int stockvalue) {
	this.stockvalue = stockvalue;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}





}
