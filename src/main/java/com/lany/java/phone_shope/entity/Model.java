package com.lany.java.phone_shope.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


//@Data
@Entity
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
@ManyToOne
@JoinColumn(name = "brandId")
private Brand brand;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Brand getBrand() {
	return brand;
}
public void setBrand(Brand brand) {
	this.brand = brand;
}




}
