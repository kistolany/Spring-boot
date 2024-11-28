package com.lany.java.phone_shope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lany.java.phone_shope.dto.BrandDTBO;
import com.lany.java.phone_shope.entity.Brand;
import com.lany.java.phone_shope.service.BrandService;
import com.lany.java.phone_shope.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {
	@Autowired
  private BrandService brandService;
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTBO brandDTBO) {
		Brand brand = Mapper.toBrand(brandDTBO);
		 brand = brandService.create(brand);
		return ResponseEntity.ok(brand);
	}
}
