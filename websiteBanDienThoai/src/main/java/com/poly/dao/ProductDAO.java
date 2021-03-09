package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {//JpaRepository<kiểu thực thể, kiểu dữ liệu khóa chính >

	@Query("SELECT p FROM Product p "+" WHERE p.name LIKE %:kw% OR p.category.name LIKE %:kw%")
	List<Product> findByKeywords(@Param("kw") String keywords); 

}
