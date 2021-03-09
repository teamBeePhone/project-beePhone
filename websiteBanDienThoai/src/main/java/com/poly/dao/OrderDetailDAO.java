package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.entity.Customer;
import com.poly.entity.OrderDetail;
import com.poly.entity.Report;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {
	@Query("SELECT new Report(o.product.name, sum(o.unitPrice * o.quantity),  sum(o.quantity), min(o.unitPrice), max(o.unitPrice), avg(o.unitPrice)) "
			+ " FROM OrderDetail o "
			+ " WHERE o.order.customer=:user AND o.order.status=2"
			+ " GROUP BY o.product.name")
	List<Report> getPurchaseByUser(@Param("user") Customer user);
}
