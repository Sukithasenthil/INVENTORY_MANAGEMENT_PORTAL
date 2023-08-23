package com.example.demo.r1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class ProductModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int prodId;
@Column(name="prodname")
private String prodname;
private String product;
private int prodmfg;
private String proaddres;
private int prodprice;

private int supplierid;
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdname() {
	return prodname;
}
public void setProdName(String prodname) {
	this.prodname = prodname;
}

public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getProdmfg() {
	return prodmfg;
}
public void setProdmfg(int prodmfg) {
	this.prodmfg = prodmfg;
}
public String getProaddres() {
	return proaddres;
}
public void setProddes(String proaddres) {
	this.proaddres = proaddres;
}
public int getProdprice() {
	return prodprice;
}
public void setProdprice(int prodprice) {
	this.prodprice = prodprice;
}
public int getSupplierid() {
	return supplierid;
}
public void setSupplierid(int supplierid) {
	this.supplierid = supplierid;
}

}
