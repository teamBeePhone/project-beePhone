package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Integer> {
	@Query("SELECT o FROM Order o WHERE o.customer.id=:uid")
	List<Order> findByUsername(@Param("uid") String username);
}

