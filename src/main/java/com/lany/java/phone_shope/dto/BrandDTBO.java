package com.lany.java.phone_shope.dto;

import lombok.Data;

//@Data
public class BrandDTBO {
	private Integer id;
    private String name;
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


};