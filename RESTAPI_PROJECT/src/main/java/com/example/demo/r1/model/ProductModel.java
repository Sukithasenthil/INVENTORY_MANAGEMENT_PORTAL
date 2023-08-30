package com.example.demo.r1.model;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
 
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="product")
public class ProductModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name="prodid")
private int prodId;
@Column(name="prodname")  
private String prodname;
private String product;

private int prodmfg;
private String proaddres;
private int prodprice;



@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="supplierid",referencedColumnName = "prodid")
private List<SupplierModel> supplierid;


@OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
@JoinColumn(name="inventoryid")
private InventoryModel inventoryid;

@OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
@JoinColumn(name="warehouseid")
private WarehouseModel warehouseid;
 


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
public List<SupplierModel> getSupplierid() {
	return supplierid;
}
public void setSupplierid(List<SupplierModel> supplierid) {
	this.supplierid = supplierid;
}
public InventoryModel getInventoryid() {
	return inventoryid;
}
public void setInventoryid(InventoryModel inventoryid) {
	this.inventoryid = inventoryid;
}
public WarehouseModel getWarehouseid() {
	return warehouseid;
}
public void setWarehouseid(WarehouseModel warehouseid) {
	this.warehouseid = warehouseid;
}



}
