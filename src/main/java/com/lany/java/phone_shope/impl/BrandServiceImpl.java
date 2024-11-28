package com.lany.java.phone_shope.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lany.java.phone_shope.entity.Brand;
import com.lany.java.phone_shope.repository.BrandRepository;
import com.lany.java.phone_shope.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
	private BrandRepository brandRepository;
	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

}
