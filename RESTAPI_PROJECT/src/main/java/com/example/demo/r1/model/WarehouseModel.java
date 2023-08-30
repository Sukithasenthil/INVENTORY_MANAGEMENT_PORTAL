package com.example.demo.r1.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WarehouseModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int warid;
private String name;
private String location;
private int capacity;
public int getWarid() {
	return warid;
}
public void setWarid(int warid) {
	this.warid = warid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}

}
