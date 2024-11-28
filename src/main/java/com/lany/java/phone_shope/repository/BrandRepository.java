package com.lany.java.phone_shope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lany.java.phone_shope.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
