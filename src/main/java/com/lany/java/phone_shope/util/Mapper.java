package com.lany.java.phone_shope.util;

import java.security.PublicKey;

import com.lany.java.phone_shope.dto.BrandDTBO;
import com.lany.java.phone_shope.entity.Brand;

public class Mapper {
  public static Brand toBrand(BrandDTBO brandDTBO) {
	  
	  Brand brand = new Brand();
	  brand.setId(brandDTBO.getId());
	  brand.setName(brandDTBO.getName());
	  
	  return brand;
  }
}
