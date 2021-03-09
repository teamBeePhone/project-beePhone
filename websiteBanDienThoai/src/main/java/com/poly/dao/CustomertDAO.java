package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.entity.Customer;

public interface CustomertDAO extends JpaRepository<Customer, String> { //JpaRepository<kiểu thực thể, kiểu dữ liệu khóa chính >
	@Query("SELECT c FROM Customer c WHERE c.admin=:role")
	List<Customer> findAllByRole(@Param("role") boolean admin);// đưa vào true:admin, false: customer
}
